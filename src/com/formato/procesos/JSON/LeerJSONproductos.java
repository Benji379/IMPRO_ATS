package com.formato.procesos.JSON;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;

public class LeerJSONproductos {

    public static void main(String[] args) {
        String contenidoJSON = "{\"total\":\"1083.10\",\"productos\":[{\"precio\":\"31.40\",\"idProducto\":130212,\"cantidad\":36},{\"precio\":\"13.20\",\"idProducto\":130216,\"cantidad\":10},{\"precio\":\"14.10\",\"idProducto\":1243334,\"cantidad\":18},{\"precio\":\"17.30\",\"idProducto\":1482943,\"cantidad\":19}]}";

        JSONObject jsonRegistro = new JSONObject(contenidoJSON);

        if (jsonRegistro != null) {
            double total = jsonRegistro.optDouble("total");
            System.out.println("Total: " + total);
            JSONArray jsonProductos = jsonRegistro.optJSONArray("productos");

            if (jsonProductos != null) {
                List<Producto> productos = parseProductos(jsonProductos);
                for (Producto producto : productos) {
                    System.out.println("ID Producto: " + producto.getIdProducto());
                    System.out.println("Precio: " + producto.getPrecio());
                    System.out.println("Cantidad: " + producto.getCantidad());
                }
            }
        }
    }

    private static List<Producto> parseProductos(JSONArray jsonProductos) {
        List<Producto> productos = new ArrayList<>();

        for (int i = 0; i < jsonProductos.length(); i++) {
            JSONObject jsonProducto = jsonProductos.optJSONObject(i);
            
            int idProducto = jsonProducto.optInt("idProducto");
            double precio = jsonProducto.optDouble("precio");
            int cantidad = jsonProducto.optInt("cantidad");

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
