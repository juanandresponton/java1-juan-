package ejercicios_final;

import java.util.Scanner;

public class CalculadoraFactorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número para calcular el factorial: ");
        int numero = scanner.nextInt();

        long factorial = calcularFactorial(numero);

        System.out.println("El factorial de " + numero + " es: " + factorial);
    }


    private static long calcularFactorial(int n) {
        if (n < 0) {
            System.out.println("El factorial no está definido para números negativos.");
            System.exit(0);
        }

        long resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }
}

