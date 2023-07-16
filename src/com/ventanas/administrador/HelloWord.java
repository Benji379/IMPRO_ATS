/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ventanas.administrador;
import java.net.*;
import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import org.xml.sax.SAXException;

public class HelloWord {

    public static void main(String[] args) {
        try {
            String host = "www.regcheck.org.uk";
            Socket socket = new Socket(host, 80);
            // Cambia "yourusernamehere" por tu nombre de usuario
            String request = "GET /api/reg.asmx/CheckNorway?RegistrationNumber=BS23162&username=yourusernamehere HTTP/1.0\r\n\r\n";
            OutputStream os = socket.getOutputStream();
            os.write(request.getBytes());
            os.flush();

            InputStream in = socket.getInputStream();
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String read;

            while ((read = br.readLine()) != null) {
                sb.append(read);
            }
            
            br.close();
            String strXml = sb.toString();
            int intStart = strXml.indexOf("<?xml");
            strXml = strXml.substring(intStart);

            socket.close();

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            ByteArrayInputStream input = new ByteArrayInputStream(strXml.getBytes("UTF-8"));
            Document doc = builder.parse(input);
            NodeList nList = doc.getElementsByTagName("Description");
            Node nNode = nList.item(0);
            System.out.print(nNode.getTextContent());
        } catch (IOException | ParserConfigurationException | DOMException | SAXException ex) {
            System.out.print("Error"+ex.getMessage());
        }
    }
}
