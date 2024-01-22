package b4;
import java.util.Arrays;

//
public class Ejercicio2 {
    public static void main(String[] args) {
        int[] ordename={27,18,2,14,25};
        System.out.println("Original");
        Arrays.stream(ordename).forEach(System.out::println);
        System.out.println("________________________________");
        int[] ordenadoA= ascendente(ordename);//  2 14  18 25 27
        System.out.println("________________________________");
        int[] ordenadoD= descendente(ordename);//    27 25 18 14 2

    }
    private static int[] ascendente(int[] arreglo){
        int[] ordenado =arreglo.clone();

        for (int i =0; i< ordenado.length-1;i++){
            for (int j =0; j< ordenado.length-1;j++){
                if (ordenado[j] >ordenado[j+1]) {
                    int temp = ordenado[j];
                    ordenado[j] = ordenado[j+1];
                    ordenado[j+1] = temp;
                }
            }
        }
        Arrays.stream(ordenado).forEach(System.out::println);

        return ordenado;
    }

    private static void imprimirArreglo(int[] ordenado) {


    }

    private static int[] descendente(int[] arreglo){
        int[] ordenado =arreglo.clone();

        for (int i =0; i< ordenado.length-1;i++){
            for (int j =0; j< ordenado.length-1-i;j++){
                if (ordenado[j] < ordenado[j+1]) {
                    int temp = ordenado[j];
                    ordenado[j] = ordenado[j+1];
                    ordenado[j+1] = temp;
                }
            }
        }
        Arrays.stream(ordenado).forEach(System.out::println);
        return ordenado;
    }
}

