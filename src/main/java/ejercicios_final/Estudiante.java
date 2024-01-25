package ejercicios_final;

import java.util.Arrays;
import java.util.Scanner;

public class Estudiante {

    private String nombre;
    private int edad;
    private double[] calificaciones;

    // Constructor
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = obtenerCalificacionesDesdeTeclado();
    }

    // Método para ingresar las calificaciones desde el teclado
    private double[] obtenerCalificacionesDesdeTeclado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de calificaciones: ");
        int cantidadCalificaciones = scanner.nextInt();

        double[] calificaciones = new double[cantidadCalificaciones];

        for (int i = 0; i < cantidadCalificaciones; i++) {
            System.out.print("Ingrese la calificación #" + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        return calificaciones;
    }

    // Método para calcular el promedio de calificaciones
    public double calcularPromedio() {
        if (calificaciones.length == 0) {
            return 0; // Si no hay calificaciones, el promedio es 0.
        }

        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }

        return suma / calificaciones.length;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificaciones: " + Arrays.toString(calificaciones));
        System.out.println("Promedio de calificaciones: " + calcularPromedio());
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Estudiante estudiante = new Estudiante("juan andres ponton", 16);
        estudiante.mostrarInformacion();
    }
}
