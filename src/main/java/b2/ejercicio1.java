package b2;
import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {

        int num1,num2,resultadoSuma=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el primer numero");
        num1=scanner.nextInt();

        //Hace el ingreso del segundo dato
        System.out.println("Digite el segundo numero");
        num2=scanner.nextInt();

        resultadoSuma=num1+num2;
        System.out.println("El resultado de la operacion es: " + resultadoSuma);
        scanner.close();
    }
}


