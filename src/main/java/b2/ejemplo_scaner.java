package b2;

import java.util.Scanner;

class ejemplo_scaner
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");

        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");

        int edad = scanner.nextInt();

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años.");

        scanner.close();
    }
}