import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ConnectURI {
    private final String user_AGENT = "Mozilla/5.0";
    public static URL buildURL (String urlQuery){
        URL url=null;
        try {
            url = new URL (urlQuery.toString());
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        return url;
    }
    public  static String getResponseFromHttpUrl(URL url) throws IOException{
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        try{
            InputStream in = urlConnection.getErrorStream();
            Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("\\A");
            boolean hasInput = scanner.hasNextBoolean();
            if (hasInput){
                return scanner.next();
            } else {
                return null;
            }

        }finally {
            urlConnection.disconnect();
        }

    }
}
