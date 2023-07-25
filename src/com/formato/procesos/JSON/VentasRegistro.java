package com.formato.procesos.JSON;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class VentasRegistro {

    private final int sede;
    private final int id;
    private final String dni;
    private final String fecha;
    private final Map<Integer, Double[]> productosMap; // key: idProducto, value: [precio, cantidad]
    private double total;

    public VentasRegistro(int sede, int id, String dni, String fecha) {
        this.sede = sede;
        this.id = id;
        this.dni = dni;
        this.fecha = fecha;
        this.productosMap = new HashMap<>();
        this.total = 0.0;
    }

    public void agregarProducto(int idProducto, double precio, int cantidad) {
        if (productosMap.containsKey(idProducto)) {
            Double[] productoActual = productosMap.get(idProducto);
            productoActual[0] += precio; // sumar precio
            productoActual[1] += cantidad; // sumar cantidad
        } else {
            Double[] nuevoProducto = {precio, (double) cantidad};
            productosMap.put(idProducto, nuevoProducto);
        }
        total += precio * cantidad;
    }

    public String generarRegistroVentas() {
        StringBuilder sb = new StringBuilder();

        // Formato para el precio con dos decimales
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.00", symbols);

        sb.append("[sede:").append(sede).append(";id:").append(id).append(";dni:").append(dni)
                .append(";fecha:").append(fecha).append("],{productos:[");

        // Generar la sección de productos
        boolean firstProduct = true;
        for (Map.Entry<Integer, Double[]> entry : productosMap.entrySet()) {
            int idProducto = entry.getKey();
            Double[] productoData = entry.getValue();
            double precio = productoData[0];
            int cantidad = productoData[1].intValue();

            if (!firstProduct) {
                sb.append(",");
            } else {
                firstProduct = false;
            }

            sb.append("[idProducto:").append(idProducto).append(":precio:")
                    .append(decimalFormat.format(precio)).append(":cantidad:").append(cantidad).append("]");
        }

        sb.append("]},[total:").append(decimalFormat.format(total)).append("]");

        return sb.toString();
    }

    public void guardarRegistroEnJSON(String archivo) {
        // Crear un objeto JSON para almacenar los datos
        JSONObject jsonRegistro = new JSONObject();

        // Agregar los datos básicos al objeto JSON
        jsonRegistro.put("sede", sede);
        jsonRegistro.put("id", id);
        jsonRegistro.put("dni", dni);
        jsonRegistro.put("fecha", fecha);

        // Crear un arreglo JSON para los productos
        JSONArray jsonProductos = new JSONArray();

        // Agregar los productos al arreglo JSON
        for (Map.Entry<Integer, Double[]> entry : productosMap.entrySet()) {
            int idProducto = entry.getKey();
            Double[] productoData = entry.getValue();
            double precio = productoData[0];
            int cantidad = productoData[1].intValue();

            JSONObject jsonProducto = new JSONObject();
            jsonProducto.put("idProducto", idProducto);
            jsonProducto.put("precio", precio);
            jsonProducto.put("cantidad", cantidad);

            jsonProductos.put(jsonProducto);
        }

        // Agregar el arreglo JSON de productos al objeto principal
        jsonRegistro.put("productos", jsonProductos);

        // Agregar el total al objeto JSON
        jsonRegistro.put("total", total);

        // Escribir el objeto JSON en un archivo
        try (FileWriter file = new FileWriter(archivo)) {
            file.write(jsonRegistro.toString());
            System.out.println("Registro de ventas guardado en el archivo JSON: " + archivo);
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        VentasRegistro registroVentas = new VentasRegistro(2, 192, "71936801", "2023-07-22 02:00:19");

        // Agregar productos al registro de ventas
        registroVentas.agregarProducto(130216, 13.20, 10);
        registroVentas.agregarProducto(1482943, 17.30, 19);
        registroVentas.agregarProducto(130212, 9.10, 11);
        registroVentas.agregarProducto(130212, 13.20, 10);
        registroVentas.agregarProducto(1243334, 14.10, 18);

        // Generar el registro de ventas final
        String resultadoVentas = registroVentas.generarRegistroVentas();

        // Mostrar el resultado
        System.out.println(resultadoVentas);

        // Guardar el registro en un archivo JSON
//        registroVentas.guardarRegistroEnJSON("registro_ventas.json");
    }
}
