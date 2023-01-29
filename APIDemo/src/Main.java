import java.io.*;
import java.net.*;
import java.sql.SQLOutput;

public class Main {
    private static    HttpURLConnection connection;
    public static void main(String[] args) {

        

        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/albums");
            connection = (HttpURLConnection) url.openConnection();

           connection.setRequestMethod("GET");
            int status = connection.getResponseCode();
         //   System.out.println(status);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}