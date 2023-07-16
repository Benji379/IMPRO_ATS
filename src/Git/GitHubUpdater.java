package Git;

/**
 *
 * @author Benji
 */
import java.io.*;
import java.net.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class GitHubUpdater {

    // URL del repositorio de GitHub
    private static final String GITHUB_REPO_URL = "https://github.com/tu_usuario/tu_repositorio/archive/main.zip";
    private static final String TEMP_ZIP_FILE = "temp_update.zip";

    public static void main(String[] args) {
        checkAndUpdate();
    }

    public static void checkAndUpdate() {
        try {
            URL url = new URL(GITHUB_REPO_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Descargar el archivo ZIP del repositorio
                try (InputStream inputStream = connection.getInputStream();
                        FileOutputStream outputStream = new FileOutputStream(TEMP_ZIP_FILE)) {
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }
                }

                // Descomprimir el archivo ZIP
                try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(TEMP_ZIP_FILE))) {
                    ZipEntry entry = zipInputStream.getNextEntry();
                    while (entry != null) {
                        File file = new File(entry.getName());
                        if (!entry.isDirectory()) {
                            try (FileOutputStream fos = new FileOutputStream(file)) {
                                byte[] buffer = new byte[1024];
                                int bytesRead;
                                while ((bytesRead = zipInputStream.read(buffer)) != -1) {
                                    fos.write(buffer, 0, bytesRead);
                                }
                            }
                        }
                        zipInputStream.closeEntry();
                        entry = zipInputStream.getNextEntry();
                    }
                }

                // Eliminar el archivo ZIP temporal
                File tempFile = new File(TEMP_ZIP_FILE);
                tempFile.delete();

                // Reiniciar el programa o recargar las clases actualizadas
                // Implementa aquí la lógica para reiniciar o recargar tu programa
            } else {
                System.out.println("No hay actualizaciones disponibles.");
            }
        } catch (IOException e) {
            System.err.println("Error al verificar y actualizar: " + e.getMessage());
        }
    }
}
