import java.io.IOException;
import java.lang.ref.Array;
import java.net.URL;
import java.util.ArrayList;

public class FirstConnection {
    public static void main (String[] args) throws IOException {
        connecturl koneksisaya = new Connecturl();
        URL myAddress = koneksisaya.buildURL
                ("https:harber.mimoapps.xyz/api/gettacces.php");
        String response = Koneksisaya.get.ResponseneFromHttpUrl(myAddress);
        System.out.println(response);
        //decoding JSON
        assert response ! = null;
        JSONArray responseJSON = new JSONArray(response);
        ArrayList<ResponModel> responModel = new ArrayList<>();
        for (int i =0;i <response.length();i++){

        }
    }
}