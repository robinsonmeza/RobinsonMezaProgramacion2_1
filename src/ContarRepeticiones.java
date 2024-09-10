package ProyectosdeClase;

import java.util.Arrays;
import java.util.Scanner;

public class ContarRepeticiones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Cuantos indices posee el vector (N): ");
        int N = scanner.nextInt();

        
        int[] vector = new int[N];

       VectoresMet.LLenarVectorAleatoreo(vector);

        
        System.out.println("Vector: " + Arrays.toString(vector));

       
        System.out.print("Ingrese el numero X para contar sus repeticiones: ");
        int X = scanner.nextInt();

        
        int repeticiones = VectoresMet.contarRepeticiones(vector, X);

       
        System.out.println("El numero " + X + " se repite " + repeticiones + " veces.");
    }
}
