package com.formato.procesos;

import com.ventanas.TRABAJADOR.panel_Bienvenida_TRABAJADOR;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author Benji
 */
public class Clima_TRABAJADOR implements ActionListener {

    public static void Clima() {
        String city = "Lima";
        JSONObject weatherData = WeatherAPI.getWeatherData(city);
        if (weatherData != null) {
            JSONObject main = (JSONObject) weatherData.get("main");
            double temperatureKelvin = (double) main.get("temp");
            double temperatureCelsius = temperatureKelvin - 273.15;

            long humidity = (long) main.get("humidity");

            JSONObject wind = (JSONObject) weatherData.get("wind");
            double windSpeedMps = (double) wind.get("speed");
            double windSpeedKph = windSpeedMps * 3.6; // Conversión de m/s a km/h

//            System.out.println("Temperatura en " + city + ": " + Math.round(temperatureCelsius) + "°C");
//            System.out.println("Humedad: " + humidity + "%");
//            System.out.println("Viento: a " + Math.round(windSpeedKph) + " km/h");
            JSONArray weatherArray = (JSONArray) weatherData.get("weather");
            JSONObject weather = (JSONObject) weatherArray.get(0);
            String weatherDescription = (String) weather.get("description");
//            System.out.println("Estado del clima: " + weatherDescription);

            // Determinar el estado del clima
            String weatherState = getWeatherState(weatherDescription);
//            System.out.println("Estado: " + weatherState);

            JSONObject sys = (JSONObject) weatherData.get("sys");
            long sunriseTimestamp = (long) sys.get("sunrise");
            long sunsetTimestamp = (long) sys.get("sunset");
            long currentTimestamp = (long) weatherData.get("dt");

            // Determinar si es de día o de noche
            boolean isDayTime = isDayTime(currentTimestamp, sunriseTimestamp, sunsetTimestamp);
            String dayTime = isDayTime ? "Día" : "Noche";
//            System.out.println("Período del día: " + dayTime);

            //IMPRIMO EN LOS PANELES de BIEVENIDA
            panel_Bienvenida_TRABAJADOR.txtTemperatura.setText(String.valueOf(Math.round(temperatureCelsius)));
            panel_Bienvenida_TRABAJADOR.txtHumedad.setText("Humedad: " + humidity + "%");
            panel_Bienvenida_TRABAJADOR.txtViento.setText("Viento: a " + Math.round(windSpeedKph) + " km/h");
            panel_Bienvenida_TRABAJADOR.txtEstado.setText(weatherState);
            panel_Bienvenida_TRABAJADOR.txtCiudad.setText(city);

            ImageIcon nuevoIcono = new ImageIcon(Clima_TRABAJADOR.class.getResource("/com/img/Clima/" + weatherDescription + ".png"));
            panel_Bienvenida_TRABAJADOR.imgClima.setIcon(nuevoIcono);

        } else {
            System.out.println("No se pudo obtener la información del clima.");
        }
    }

    private static boolean isDayTime(long currentTimestamp, long sunriseTimestamp, long sunsetTimestamp) {
        return currentTimestamp >= sunriseTimestamp && currentTimestamp <= sunsetTimestamp;
    }

    private static String getWeatherState(String weatherDescription) {
        String state = "Desconocido";

        if (weatherDescription.contains("clear sky")) {
            state = "Despejado";
        } else if (weatherDescription.contains("few clouds")) {
            state = "Algunas nubes";
        } else if (weatherDescription.contains("scattered clouds")) {
            state = "Nubes dispersas";
        } else if (weatherDescription.contains("broken clouds")) {
            state = "Nublado";
        } else if (weatherDescription.contains("overcast clouds")) {
            state = "Nublado";
        } else if (weatherDescription.contains("shower rain")) {
            state = "Lluvia con chubascos";
        } else if (weatherDescription.contains("rain")) {
            state = "Lluvioso";
        } else if (weatherDescription.contains("thunderstorm")) {
            state = "Tormenta";
        } else if (weatherDescription.contains("snow")) {
            state = "Nieve";
        } else if (weatherDescription.contains("mist")) {
            state = "Neblina";
        }

        return state;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Date hora = new Date();
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Calendar hoy = Calendar.getInstance();
        String horaMinutos = String.format(format.format(hora), hoy);
        String dia = Proceso.getDiaSemana();
        panel_Bienvenida_TRABAJADOR.txtDiaHora.setText(dia + ", " + horaMinutos);
    }

}
