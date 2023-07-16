package gpt;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Benji
 */
public class ChatGptGOD {

    // Variable para almacenar la conversación
    private static List<String> conversacion = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String pregunta;
        pregunta = "Dame una lista de los países más desarrollados del mundo";
        System.out.println(chatGPT(pregunta));
        String hola = "Mi nombre es Benjamin";
        System.out.println(chatGPT(hola));
        String pre="Como me llamo?";
        System.out.println(chatGPT(pre));
    }
    
    public static String chatGPT(String message) {
        String url = "https://api.openai.com/v1/chat/completions";
        String apiKey = "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";
        String model = "gpt-3.5-turbo";
        
        try {
            // Agregar el mensaje actual a la conversación
            conversacion.add(message);
            // Create the HTTP POST request
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Authorization", "Bearer " + apiKey);
            con.setRequestProperty("Content-Type", "application/json");

            // Build the request body
            // Incluir todos los mensajes de la conversación en el campo "messages"
            JSONArray messagesArray = new JSONArray();
            for (String msg : conversacion) {
                JSONObject messageObj = new JSONObject();
                messageObj.put("role", "user");
                messageObj.put("content", msg);
                messagesArray.put(messageObj);
            }

            JSONObject requestBody = new JSONObject();
            requestBody.put("model", model);
            requestBody.put("messages", messagesArray);

            con.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
            writer.write(requestBody.toString());
            writer.flush();
            writer.close();

            // Get the response
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // Parse the JSON response
            JSONObject jsonResponse = new JSONObject(response.toString());
            JSONArray choicesArray = jsonResponse.getJSONArray("choices");
            if (choicesArray.length() > 0) {
                JSONObject choiceObject = choicesArray.getJSONObject(0);
                String content = choiceObject.getJSONObject("message").getString("content");

                // Eliminar detalles adicionales
                content = content.replaceAll("\\\\n", "").replaceAll("\\\\r", "").replaceAll("\\\\t", "").replaceAll("\"", "");

                // Agregar la respuesta del asistente a la conversación
                conversacion.add(content);

                return content;
            }

            throw new RuntimeException("Unable to extract response content");

        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
