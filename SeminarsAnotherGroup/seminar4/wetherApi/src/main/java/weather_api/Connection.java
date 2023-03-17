package weather_api;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Connection {
    private static final String apiKey = "4548dbc03f134d8c8d56387c7d3462c0";
    public String getInfo(String city) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        URL url = new URL("http://api.weatherstack.com/current?access_key=" + apiKey + "&query=" + city);
        // https://api.weatherstack.com/current?access_key=eceae5bae9142cc79ef4bb4199703b7f&query=moscow
        URLConnection connection = url.openConnection();
        Scanner scanner = new Scanner(connection.getInputStream());
        while (scanner.hasNext()){
            stringBuilder.append(scanner.nextLine());
        }
        return stringBuilder.toString();
    }
}
