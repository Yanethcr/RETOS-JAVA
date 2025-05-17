import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        // Ruta del archivo de logs
        Path logPrincipal = Paths.get("C:/Users/yanet/IdeaProjects/Reto02_S7/src/err.log");
        Path archivoFallos = Paths.get("C:/Users/yanet/IdeaProjects/Reto01_S7/src/registro_fallos.txt");

        int lineasLeidas = 0;
        int erroresDetectados = 0;
        int advertenciasDetectadas = 0;

        try (BufferedReader br = Files.newBufferedReader(logPrincipal)) {
            String lineaActual;

            while ((lineaActual = br.readLine()) != null) {
                lineasLeidas++;

                if (lineaActual.contains("ERROR")) {
                    erroresDetectados++;
                }
                if (lineaActual.contains("WARNING")) {
                    advertenciasDetectadas++;
                }
            }

            // Resumen del análisis
            System.out.println("\n📄 Análisis de Logs:");
            System.out.println("🧾 Líneas revisadas: " + lineasLeidas);
            System.out.println("❗ Errores encontrados: " + erroresDetectados);
            System.out.println("⚠️ Advertencias encontradas: " + advertenciasDetectadas);

            double porcentajeErrores = (lineasLeidas > 0) ? (erroresDetectados * 100.0 / lineasLeidas) : 0;
            double porcentajeAdvertencias = (lineasLeidas > 0) ? (advertenciasDetectadas * 100.0 / lineasLeidas) : 0;

            System.out.printf("📊 Porcentaje de errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("📊 Porcentaje de advertencias: %.2f%%\n", porcentajeAdvertencias);

        } catch (IOException ex) {
            System.out.println("🚫 No se pudo leer el archivo de logs: " + ex.getMessage());

            // Registrar el error en otro archivo
            try (BufferedWriter bw = Files.newBufferedWriter(archivoFallos)) {
                bw.write("Error al intentar analizar el archivo de logs: " + ex.getMessage());
            } catch (IOException err) {
                System.out.println("🚫 Además, no se pudo registrar el fallo en el archivo de respaldo.");
            }
        }
    }
}
