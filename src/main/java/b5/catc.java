package b5;
public class catc {
    public static void main(String[] args) {


        try {
            // Código que podría lanzar una excepción
            int resultado = dividir(10, 1);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException error) {
            // Manejo de la excepción
            System.out.println("Error: División por cero no permitida."+error.getMessage());
        }catch (RuntimeException e2) {
            // Manejo de la excepción
            System.out.println("Error: División por cero no permitida."+e2.getMessage());
        }
        System.out.println("Termino Con exito: " );
    }

    // Método que realiza una división y puede lanzar una excepción
    public static int dividir(int numerador, int denominador) {
        return numerador / denominador;
    }
}