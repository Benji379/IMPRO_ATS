package com.formato.procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.JOptionPane;
import org.json.JSONException;
import org.json.JSONObject;

public class ConsultaDNI {

    String nombres;
    String apellidoP;
    String apellidoM;
    String dni;

    public ConsultaDNI(String dni) {
        this.dni = dni;
        nombres = "";
        apellidoP = "";
        apellidoM = "";
    }
    Proceso ic = new Proceso();

    public void ConsultaDNI() {
        BufferedReader reader = null;
        try {
            String url = "https://dniruc.apisperu.com/api/v1/dni/" + dni + "?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJlbWFpbCI6ImF0b2NoZWxvcGV6YkBnbWFpbC5jb20ifQ.SLSDf0nWwZKfhN2YPpRpz20QTG_6_u2xxQDXHO_1bFM";
            URL apiURL = new URL(url);
            reader = new BufferedReader(new InputStreamReader(apiURL.openStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            JSONObject data = new JSONObject(response.toString());

            if (data.getBoolean("success")) {
                this.dni = data.getString("dni");
                this.nombres = data.getString("nombres");
                this.apellidoP = data.getString("apellidoPaterno");
                this.apellidoM = data.getString("apellidoMaterno");
            } else {
                String mensage = data.getString("message");
                JOptionPane.showMessageDialog(null, mensage, "Error", JOptionPane.ERROR_MESSAGE, ic.icono("/com/img/emergentes/dni.png"));
            }
        } catch (IOException | JSONException e) {
            JOptionPane.showMessageDialog(null, "DNI inválido", "Error", JOptionPane.ERROR_MESSAGE, ic.icono("/com/img/emergentes/dni.png"));
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
        }
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public String getApellidos() {
        return apellidoP + " " + apellidoM;
    }

    public static void main(String[] args) {
        String dni = "01936801";
        ConsultaDNI p = new ConsultaDNI(dni);
        p.ConsultaDNI();
        System.out.println("Nombres: " + p.getNombres());
        System.out.println("Apellidos: " + p.getApellidos());
    }

}
