package ProyectosdeClase;

import java.util.Arrays;

public class Vectorsumacruzada {

    public static void main(String[] args) {
        int[] vectorA1 = new int[20];
        int[] vectorA2 = new int[20];
        int[] SumadeVectorescruzados = new int[20];

        VectoresMet.LLenarVectorAleatoreo(vectorA1);
        VectoresMet.LLenarVectorAleatoreo(vectorA2);

        for (int i = 0; i < vectorA1.length; i++) {
            SumadeVectorescruzados[i] = vectorA1[i] + vectorA2[vectorA2.length - 1 - i];
        }
        System.out.println("VectorA 1 " + Arrays.toString(vectorA1));
        System.out.println("VectorA 2 " + Arrays.toString(vectorA2));
        System.out.println("La suma del vector A1 + vector A2 es igual a " + Arrays.toString(SumadeVectorescruzados));

    }

}
