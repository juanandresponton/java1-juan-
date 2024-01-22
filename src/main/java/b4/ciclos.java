package b4;

import java.util.ArrayList;
import java.util.List;

public class ciclos {
    public static void main(String[] args) {
        int contador = 0;

        while (contador<5){
            System.out.println("contador = "+contador);
            contador++;
        }
        System.out.println("__________________");
        int contador2 = 0;

        do {
            System.out.println("contador = "+contador2);
            contador2++;
        }while (contador2<5);

        System.out.println("__________________");

        for (int i =0; i<5;i++){
            System.out.println("Valor de i ="+i);
        }

        List<String> listNombre = new ArrayList<>();
        listNombre.add("Mauricio");
        listNombre.add("carol");

        for (String nombre : listNombre){
            System.out.println(nombre);
        }
        System.out.println("__________________");
        listNombre.forEach(nombre-> System.out.println(nombre));
    }
}
