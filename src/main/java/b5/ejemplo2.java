package b5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ejemplo2 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("hola.txt"));
            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error de lectura: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar el archivo: " + e.getMessage());
            } finally {
                System.out.println("Este bloque se ejecutará siempre.");
            }
        }
    }
}

