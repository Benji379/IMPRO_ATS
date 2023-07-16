package com.formato.procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Benji
 */

public class WeatherAPI {

    private static final String API_KEY = "7c50a3b8fd74a2ca2c948b0febfe0e97";

    public static JSONObject getWeatherData(String city) {
        
        try {
            String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + API_KEY;
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                StringBuilder response;
                try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                    String inputLine;
                    response = new StringBuilder();
                    while ((inputLine = in.readLine()) != null) {
                        response.append(inputLine);
                    }
                }

                JSONParser parser = new JSONParser();
                return (JSONObject) parser.parse(response.toString());
            }
        } catch (IOException | ParseException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return null;
    }
}
