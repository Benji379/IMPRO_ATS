package com.formato.procesos.JSON;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LeerRegistroVenta {

    public static void main(String[] args) {
        String contenidoJSON = "[sede:2;id:192;dni:71936801;fecha:2023-07-22 02:00:19],{productos:[[idProducto:1243334:precio:14.10:cantidad:18],[idProducto:130212:precio:22.30:cantidad:21],[idProducto:130216:precio:13.20:cantidad:10],[idProducto:1482943:precio:17.30:cantidad:19]]},[total:946.60]";

        JSONObject jsonRegistro = parseContenidoJSON(contenidoJSON);
        
        if (jsonRegistro != null) {
            int sede = jsonRegistro.optInt("sede");
            int id = jsonRegistro.optInt("id");
            String dni = jsonRegistro.optString("dni");
            String fechaString = jsonRegistro.optString("fecha");

            Date fecha = parseFecha(fechaString);
            
            JSONArray jsonProductos = jsonRegistro.optJSONArray("productos");

            if (jsonProductos != null) {
                System.out.println("Sede: "+sede);
                System.out.println("ID: " + id);
                System.out.println("DNI: " + dni);
                System.out.println("Fecha: " + fecha);

                List<Producto> productos = parseProductos(jsonProductos);
                for (Producto producto : productos) {
                    System.out.println("ID Producto: " + producto.getIdProducto());
                    System.out.println("Precio: " + producto.getPrecio());
                    System.out.println("Cantidad: " + producto.getCantidad());
                }
            }

            double total = jsonRegistro.optDouble("total");
            System.out.println("Total: " + total);
        }
    }

    private static JSONObject parseContenidoJSON(String contenidoJSON) {
        JSONObject jsonRegistro = new JSONObject();

        Pattern sectionPattern = Pattern.compile("\\[(.*?)],\\{(.*?)},\\[(.*?)]");
        Matcher sectionMatcher = sectionPattern.matcher(contenidoJSON);

        if (sectionMatcher.find()) {
            String basicInfoSection = sectionMatcher.group(1);
            String productosSection = sectionMatcher.group(2);
            String totalSection = sectionMatcher.group(3);

            parseBasicInfoSection(basicInfoSection, jsonRegistro);
            parseProductosSection(productosSection, jsonRegistro);
            parseTotalSection(totalSection, jsonRegistro);
        }

        return jsonRegistro;
    }

    private static void parseBasicInfoSection(String section, JSONObject parentObject) {
        Pattern keyValuePattern = Pattern.compile("([^:;]+):([^;]+)");
        Matcher keyValueMatcher = keyValuePattern.matcher(section);

        while (keyValueMatcher.find()) {
            String key = keyValueMatcher.group(1);
            String value = keyValueMatcher.group(2);
            parentObject.put(key, value);
        }
    }

    private static void parseProductosSection(String section, JSONObject parentObject) {
        JSONArray jsonArray = new JSONArray();
        Pattern productPattern = Pattern.compile("\\[([^\\]]+)]");
        Matcher productMatcher = productPattern.matcher(section);

        while (productMatcher.find()) {
            String productData = productMatcher.group(1);
            String[] productValues = productData.split(":");
            JSONArray productArray = new JSONArray(productValues);
            jsonArray.put(productArray);
        }

        parentObject.put("productos", jsonArray);
    }

    private static void parseTotalSection(String section, JSONObject parentObject) {
        Pattern keyValuePattern = Pattern.compile("total:([^\\]]+)");
        Matcher keyValueMatcher = keyValuePattern.matcher(section);

        if (keyValueMatcher.find()) {
            String totalValue = keyValueMatcher.group(1);
            parentObject.put("total", Double.parseDouble(totalValue));
        }
    }

    private static Date parseFecha(String fechaString) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return sdf.parse(fechaString);
        } catch (ParseException e) {
            System.out.println("ERROR: " + e.getMessage());
            return null;
        }
    }

    private static List<Producto> parseProductos(JSONArray jsonProductos) {
        List<Producto> productos = new ArrayList<>();

        for (int i = 0; i < jsonProductos.length(); i++) {
            JSONArray jsonProducto = jsonProductos.optJSONArray(i);

            int idProducto = jsonProducto.optInt(1);
            double precio = jsonProducto.optDouble(3);
            int cantidad = jsonProducto.optInt(5);

            productos.add(new Producto(idProducto, precio, cantidad));
        }

        return productos;
    }

    private static class Producto {

        private final int idProducto;
        private final double precio;
        private final int cantidad;

        public Producto(int idProducto, double precio, int cantidad) {
            this.idProducto = idProducto;
            this.precio = precio;
            this.cantidad = cantidad;
        }

        public int getIdProducto() {
            return idProducto;
        }

        public double getPrecio() {
            return precio;
        }

        public int getCantidad() {
            return cantidad;
        }
    }
}
