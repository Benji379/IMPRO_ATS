package com.formato.procesos.JSON;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GenerarRegistroJsonJTableVentas {

    private final Map<String, Double[]> productosMap; // key: idProducto, value: [precio, cantidad]
    private double total;

    public GenerarRegistroJsonJTableVentas() {
        this.productosMap = new HashMap<>();
        this.total = 0.0;
    }

    public void agregarProducto(String idProducto, double precio, int cantidad) {
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

    public void agregarProductoDesdeJTable(JTable tabla, int columnaIdProducto, int columnaPrecio, int columnaCantidad) {
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            String idProducto = model.getValueAt(i, columnaIdProducto).toString();
            double precio = Double.parseDouble(model.getValueAt(i, columnaPrecio).toString());
            int cantidad = Integer.parseInt(model.getValueAt(i, columnaCantidad).toString());

            agregarProducto(idProducto, precio, cantidad);
        }
    }

    public String generarRegistroVentasJSON() {
        // Formato para el precio con dos decimales
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.00", symbols);

        // Crear una lista de productos para ordenarlos por idProducto
        List<Map.Entry<String, Double[]>> productosList = new ArrayList<>(productosMap.entrySet());
        productosList.sort(Comparator.comparing(Map.Entry::getKey));

        // Generar la sección de productos en formato JSON
        JSONArray jsonProductos = new JSONArray();
        for (Map.Entry<String, Double[]> entry : productosList) {
            String idProducto = entry.getKey();
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
        // Supongamos que tienes una JTable llamada jTableVentas con datos válidos:
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("idProducto");
        model.addColumn("precio");
        model.addColumn("cantidad");

        // Agregar datos a la JTable
        model.addRow(new Object[]{130216, 13.20, 10});
        model.addRow(new Object[]{1482943, 17.30, 19});
        model.addRow(new Object[]{130212, 9.10, 11});
        model.addRow(new Object[]{1243334, 14.10, 18});

        JTable jTableVentas = new JTable(model);

        GenerarRegistroJsonJTableVentas registroVentas = new GenerarRegistroJsonJTableVentas();

        // Agregar productos al registro de ventas desde la JTable (columnas: 0, 1, 2)
        registroVentas.agregarProductoDesdeJTable(jTableVentas, 0, 1, 2);

        // Generar el registro de ventas final en formato JSON
        String resultadoVentasJSON = registroVentas.generarRegistroVentasJSON();

        // Mostrar el resultado en formato JSON
        System.out.println(resultadoVentasJSON);
    }

}
