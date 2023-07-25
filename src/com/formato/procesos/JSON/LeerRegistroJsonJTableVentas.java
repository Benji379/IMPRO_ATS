package com.formato.procesos.JSON;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LeerRegistroJsonJTableVentas {

    public void mostrarDatosEnJTable(JTable jTable, String textoJSON) {
        // Crear un objeto JSON a partir del texto JSON
        JSONObject jsonRegistro = new JSONObject(textoJSON);

        // Obtener el array JSON de productos
        JSONArray jsonProductos = jsonRegistro.getJSONArray("productos");

        // Crear un modelo para el JTable
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Producto");
        model.addColumn("Precio");
        model.addColumn("Cantidad");

        // Recorrer el array JSON de productos y agregar los datos al modelo
        for (int i = 0; i < jsonProductos.length(); i++) {
            JSONObject jsonProducto = jsonProductos.getJSONObject(i);
            int idProducto = jsonProducto.getInt("idProducto");
            double precio = jsonProducto.getDouble("precio");
            int cantidad = jsonProducto.getInt("cantidad");

            model.addRow(new Object[]{idProducto, precio, cantidad});
        }

        // Establecer el modelo en el JTable
        jTable.setModel(model);
    }

    public void imprimirTotal(String textoJSON) {
        // Crear un objeto JSON a partir del texto JSON
        JSONObject jsonRegistro = new JSONObject(textoJSON);

        // Obtener el valor del total y mostrarlo en la consola
        double total = jsonRegistro.getDouble("total");
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        // Supongamos que tienes un JTable llamado jTableVentas y un texto JSON válido
        JTable jTableVentas = new JTable();
        String textoJSON = "{\"total\":\"1083.10\",\"productos\":[{\"precio\":\"31.40\",\"idProducto\":130212,\"cantidad\":36},{\"precio\":\"13.20\",\"idProducto\":130216,\"cantidad\":10},{\"precio\":\"14.10\",\"idProducto\":1243334,\"cantidad\":18},{\"precio\":\"17.30\",\"idProducto\":1482943,\"cantidad\":19}]}";
        
        LeerRegistroJsonJTableVentas lector = new LeerRegistroJsonJTableVentas();
        lector.mostrarDatosEnJTable(jTableVentas, textoJSON);
        lector.imprimirTotal(textoJSON);
    }
}
