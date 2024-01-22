package b3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arreglos {
    public static void main(String[] args) {
        // Declaración e inicialización de un arreglo de enteros
        int[] numeros2 = new int[5];
        numeros2[0]=1;
        numeros2[1]=2;
        numeros2[2]=2;
        numeros2[3]=3;
        numeros2[4]=6;

        Arrays.stream(numeros2).forEach(num-> System.out.println(num));

        System.out.println("_______________________________");
        int[] numeros = {1, 2, 3, 4, 5};

        Arrays.stream(numeros).forEach(System.out::println);
        System.out.println("_______________________________");
        List<String> listNombre = new ArrayList<>();
        listNombre.add("Mauricio");
        listNombre.add("carol");

        System.out.println("_______________________________");
        listNombre.stream().forEach(System.out::println);

        System.out.println("_______________________________");
        listNombre.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
