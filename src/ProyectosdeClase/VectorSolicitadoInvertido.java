/*
Llenar un vector de n posiciones para posteriormente, invertirlo sobre sí mismo.
 */
package ProyectosdeClase;

import java.util.Scanner;

public class VectorSolicitadoInvertido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor n:");
        int N = scanner.nextInt();

        int[] VectoraInvertir = new int[N];

        VectoresMet.LLenarVectorAleatoreo(VectoraInvertir);

        System.out.println("Vector original:");
        VectoresMet.mostrarVector(VectoraInvertir);

        VectoresMet.VectorInvertido(VectoraInvertir);

        System.out.println("Vector invertido:");
        VectoresMet.mostrarVector(VectoraInvertir);

    }

}
