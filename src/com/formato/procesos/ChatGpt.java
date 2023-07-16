package com.formato.procesos;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 *
 * @author Benji
 */
public class ChatGpt {

    // Variable para almacenar la conversaciÃ³n
    private static final List<String> CONVERSACION = rellenarList.leerArchivoDeTexto("data/gpt.txt");

    public static String chatGPT(String message) {

        String url = "https://api.openai.com/v1/chat/completions";
        String apiKey = "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";
        String model = "gpt-3.5";
        
        try {
            // Agregar el mensaje actual a la conversaciÃ³n
            CONVERSACION.add(message);
            // Create the HTTP POST request
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Authorization", "Bearer " + apiKey);
            con.setRequestProperty("Content-Type", "application/json");
            // Build the request body
            // Incluir todos los mensajes de la conversaciÃ³n en el campo "messages"

            JSONArray messagesArray = new JSONArray();
            CONVERSACION.stream().map((msg) -> {
                JSONObject messageObj = new JSONObject();
                messageObj.put("role", "user");
                messageObj.put("content", msg);
                return messageObj;
            }).forEachOrdered((messageObj) -> {
                messagesArray.put(messageObj);
            });

            JSONObject requestBody = new JSONObject();
            requestBody.put("model", model);
            requestBody.put("messages", messagesArray);

            con.setDoOutput(true);
            try (OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream())) {
                writer.write(requestBody.toString());
                writer.flush();
            }

            StringBuilder response;
            try ( // Get the response
                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            }

            // Parse the JSON response
            JSONObject jsonResponse = new JSONObject(response.toString());
            JSONArray choicesArray = jsonResponse.getJSONArray("choices");
            if (choicesArray.length() > 0) {
                JSONObject choiceObject = choicesArray.getJSONObject(0);
                String content = choiceObject.getJSONObject("message").getString("content");

                // Eliminar detalles adicionales
                content = content.replaceAll("\\\\n", "").replaceAll("\\\\r", "").replaceAll("\\\\t", "").replaceAll("\"", "");

                // Agregar la respuesta del asistente a la conversaciÃ³n
                CONVERSACION.add(content);

                return content;
            }

            throw new RuntimeException("Unable to extract response content");

        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
