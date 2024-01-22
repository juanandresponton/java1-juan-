package b3;
import java.util.Scanner;

public class condicionales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 7: ");
        int numero = scanner.nextInt();

        String diaDeLaSemana = obtenerDiaDeLaSemana(numero);

        System.out.println("El día de la semana correspondiente al número " + numero + " es: " + diaDeLaSemana);
    }

    public static String obtenerDiaDeLaSemana(int numero) {
        String dia;

        switch (numero) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Lunes";
                break;
            case 3:
                dia = "Martes";
                break;
            case 4:
                dia = "Miércoles";
                break;
            case 5:
                dia = "Jueves";
                break;
            case 6:
                dia = "Viernes";
                break;
            case 7:
                dia = "Sábado";
                break;
            default:
                dia = "Número no válido. Ingrese un número del 1 al 7.";
                break;
        }

        return dia;
    }
}
/*
    public static void main(String[] args) {

        String nombre = "Mauricio";
        int num = 28;


        if (nombre.equals("Mauricio")){
            System.out.println("Eres el docente");
        }
        if (num >18) {
            System.out.println("es mayor de edad");
        }

    }}
*/
