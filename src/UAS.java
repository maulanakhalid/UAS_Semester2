import org.json.JSONObject;
import org.json.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
public class UAS {

    public class JSONFileCreator {
        public static void main(String[] args) {
            JSONObject data = new JSONObject();
            JSONObject glossary = new JSONObject();
            JSONObject glossDiv = new JSONObject();
            JSONObject glossList = new JSONObject();
            JSONObject glossEntry = new JSONObject();
            JSONObject glossDef = new JSONObject();

            // Menambahkan data ke JSON
            data.put("glossary", glossary);
            glossary.put("title", "example glossary");
            glossary.put("GlossDiv", glossDiv);
            glossDiv.put("title", "S");
            glossDiv.put("GlossList", glossList);
            glossList.put("GlossEntry", glossEntry);
            glossEntry.put("ID", "SGML");
            glossEntry.put("SortAs", "SGML");
            glossEntry.put("GlossTerm", "Standard Generalized Markup Language");
            glossEntry.put("Acronym", "ISO 8879:1986");
            glossEntry.put("GlossDef", glossDef);
            glossDef.put("para", "A meta-markup language, used to create markup languages such as DocBook");
            glossDef.put("GlossSeeAlso", new String[]{"GML", "XML"});
            glossEntry.put("GlossSee", "markup");

            // Menulis data ke file JSON
            try (FileWriter file = new FileWriter("data.json")) {
                file.write(data.toString());
                System.out.println("File JSON telah dibuat: data.json");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}