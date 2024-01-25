package ejercicios_final;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura: ");
        double temperatura = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Ingrese la unidad (C para Celsius, F para Fahrenheit): ");
        char unidad = scanner.nextLine().toUpperCase().charAt(0);

        double resultado;

        if (unidad == 'C') {
            resultado = celsiusAFahrenheit(temperatura);
            System.out.println(temperatura + " grados Celsius es equivalente a " + resultado + " grados Fahrenheit.");
        } else if (unidad == 'F') {
            resultado = fahrenheitACelsius(temperatura);
            System.out.println(temperatura + " grados Fahrenheit es equivalente a " + resultado + " grados Celsius.");
        } else {
            System.out.println("Unidad no válida. Por favor, ingrese C o F.");
        }
    }

    private static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    private static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

