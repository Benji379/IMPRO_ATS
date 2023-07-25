package com.formato.procesos;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableToHTMLConverter {

    public static String convertToHTML(JTable table, Object textoTotal, Object textoEfectivo, Object textoVuelto,
                                       Object textoTrabajador, Object textoDNI, Object textNombres, String imagenURL) {
        StringBuilder htmlBuilder = new StringBuilder();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        htmlBuilder.append("<html><head><meta charset='UTF-8'></head><body>");

        // Estilos CSS para el marco de doble línea
        htmlBuilder.append("<div style='border: 2px double; padding: 10px; text-align: center; display: inline-block;'>");

        // Título e Eslogan
        htmlBuilder.append("<h1>IMPRO ATS</h1>");
        htmlBuilder.append("<p><i>Los mejores precios</i></p>");

        // Imagen
        htmlBuilder.append("<img src='").append(imagenURL).append("' alt='Imagen' width='300'><br>");

        // Texto Trabajador, DNI y Nombres
        htmlBuilder.append("<br>--------------------------------------------------------------------------<br>");
        htmlBuilder.append("<b>Trabajador:</b> ").append(textoTrabajador).append("<br>");
        htmlBuilder.append("<b>DNI:</b> ").append(textoDNI).append("<br>");
        htmlBuilder.append("<b>Nombres:</b> ").append(textNombres).append("<br><br>");

        // Línea
        htmlBuilder.append("<br>--------------------------------------------------------------------------<br>");

        // Tabla con estilos CSS para centrar verticalmente
        htmlBuilder.append("<table border='1' style='border-collapse: collapse; margin: 0 auto; text-align: center;'>");
        // Headers
        htmlBuilder.append("<tr>");
        for (int col = 0; col < columnCount; col++) {
            htmlBuilder.append("<th>").append(model.getColumnName(col)).append("</th>");
        }
        htmlBuilder.append("</tr>");

        // Rows
        for (int row = 0; row < rowCount; row++) {
            htmlBuilder.append("<tr style='height: 100%;'>");
            for (int col = 0; col < columnCount; col++) {
                Object value = model.getValueAt(row, col);
                String cellValue = value != null ? value.toString() : "";
                if (cellValue.length() > 20) {
                    cellValue = cellValue.substring(0, 17) + "...";
                }
                htmlBuilder.append("<td style='height: 100%; vertical-align: middle;'>").append(cellValue).append("</td>");
            }
            htmlBuilder.append("</tr>");
        }

        htmlBuilder.append("</table>");

        // Reporte del Total, Efectivo y Vuelto
        htmlBuilder.append("<br>--------------------------------------------------------------------------<br>");
        htmlBuilder.append("<b>Total:</b> ").append(textoTotal).append("<br>");
        htmlBuilder.append("<b>Efectivo:</b> ").append(textoEfectivo).append("<br>");
        htmlBuilder.append("<b>Vuelto:</b> ").append(textoVuelto).append("<br>");

        htmlBuilder.append("</div></body></html>");

        return htmlBuilder.toString();
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        JTable table = new JTable(new Object[][]{{"Panetón D'ONOFRIO CAJA", 10, 50}, {"Producto 2 con nombre largo que deberá ser recortado", 5, 20}},
                new Object[]{"Nombre", "Cantidad", "Precio"});
        String imagenURL = "https://example.com/imagen.png";
        String html = convertToHTML(table, "74.39", "100.0", "25.61", "Benjamín Justo Atoche López", "72839212", "Varinia Marleni Fernández Barahona", imagenURL);
        System.out.println(html);
    }
}
        