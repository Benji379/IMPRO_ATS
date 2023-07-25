package com.formato.procesos.JSON;
import org.json.JSONArray;
import org.json.JSONObject;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class GenerarRegistroVentaProductos {

    private final Map<Integer, Double[]> productosMap; // key: idProducto, value: [precio, cantidad]
    private double total;

    public GenerarRegistroVentaProductos() {
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

    public String generarRegistroVentasJSON() {
        // Formato para el precio con dos decimales
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.00", symbols);

        // Crear una lista de productos para ordenarlos por idProducto
        List<Map.Entry<Integer, Double[]>> productosList = new ArrayList<>(productosMap.entrySet());
        productosList.sort(Comparator.comparingInt(Map.Entry::getKey));

        // Generar la sección de productos en formato JSON
        JSONArray jsonProductos = new JSONArray();
        for (Map.Entry<Integer, Double[]> entry : productosList) {
            int idProducto = entry.getKey();
            Double[] productoData = entry.getValue();
            double precio = productoData[0];
            int cantidad = productoData[1].intValue();

            // Crear un objeto JSON para el producto actual
            JSONObject jsonProducto = new JSONObject();
            jsonProducto.put("idProducto", idProducto);
            jsonProducto.put("precio", decimalFormat.format(precio));
            jsonProducto.put("cantidad", cantidad);

            jsonProductos.put(jsonProducto);
        }

        // Generar el JSON final con la sección de productos y el total
        JSONObject jsonFinal = new JSONObject();
        jsonFinal.put("productos", jsonProductos);
        jsonFinal.put("total", decimalFormat.format(total));

        return jsonFinal.toString();
    }

    public static void main(String[] args) {
        GenerarRegistroVentaProductos registroVentas = new GenerarRegistroVentaProductos();

        // Agregar productos al registro de ventas
        registroVentas.agregarProducto(130216, 13.20, 10);
        registroVentas.agregarProducto(1482943, 17.30, 19);
        registroVentas.agregarProducto(130212, 9.10, 11);
        registroVentas.agregarProducto(130212, 9.10, 15);
        registroVentas.agregarProducto(130212, 13.20, 10);
        registroVentas.agregarProducto(1243334, 14.10, 18);

        // Generar el registro de ventas final en formato JSON
        String resultadoVentasJSON = registroVentas.generarRegistroVentasJSON();

        // Mostrar el resultado en formato JSON
        System.out.println(resultadoVentasJSON);
    }
}
