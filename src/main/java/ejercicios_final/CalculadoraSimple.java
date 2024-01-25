package ejercicios_final;

import java.util.Scanner;

    public class CalculadoraSimple {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.print("Ingrese la operación (+ para suma, - para resta, * para multiplicación, / para división): ");
            char operacion = scanner.next().charAt(0);

            double resultado;
            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                        return; // Salir del programa si hay intento de dividir por cero
                    }
                    break;
                default:
                    System.out.println("Operación no válida. Por favor, ingrese +, -, * o /.");
                    return; // Salir del programa si la operación no es válida
            }
            System.out.println("El resultado de la operación es: " + resultado);
            System.out.println(resultado);
        }
    }


