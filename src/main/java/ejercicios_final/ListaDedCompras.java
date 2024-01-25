package ejercicios_final;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDedCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaDeCompras = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Lista de Compras =====");
            System.out.println("1. Agregar elemento");
            System.out.println("2. Mostrar lista");
            System.out.println("3. Eliminar elemento");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción (1-4): ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el entero

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    String nuevoElemento = scanner.nextLine();
                    listaDeCompras.add(nuevoElemento);
                    System.out.println("'" + nuevoElemento + "' ha sido agregado a la lista.");
                    break;
                case 2:
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("La lista de compras está vacía.");
                    } else {
                        System.out.println("Lista de Compras:");
                        for (String elemento : listaDeCompras) {
                            System.out.println("- " + elemento);
                        }
                    }
                    break;
                case 3:
                    if (listaDeCompras.isEmpty()) {
                        System.out.println("La lista de compras está vacía. No hay elementos para eliminar.");
                    } else {
                        System.out.print("Ingrese el elemento a eliminar: ");
                        String elementoAEliminar = scanner.nextLine();
                        if (listaDeCompras.remove(elementoAEliminar)) {
                            System.out.println("'" + elementoAEliminar + "' ha sido eliminado de la lista.");
                        } else {
                            System.out.println("'" + elementoAEliminar + "' no se encontró en la lista.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
            }
        }
    }

    public static class hola {
    }
}

