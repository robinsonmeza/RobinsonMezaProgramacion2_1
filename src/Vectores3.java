package ProyectosdeClase;
//Dados 2 vectores de 20 elementos cada uno llenarlos aleatoreamente y generar un vector mas con 
//el resultado de dicha suma

import java.util.Arrays;

public class Vectores3 {

    public static void main(String[] args) {
        // Generar dos vectores de 20 elementos
        int[] vector1 = new int[20];
        int[] vector2 = new int[20];
        int[] SumadeVectores = new int[20];

        VectoresMet.LLenarVectorAleatoreo(vector1);
        VectoresMet.LLenarVectorAleatoreo(vector2);

        for (int i = 0; i < SumadeVectores.length; i++) {
            SumadeVectores[i] = vector1[i] + vector2[i];
        }

        System.out.println("Vector 1 " + Arrays.toString(vector1));
        System.out.println("Vector 2 " + Arrays.toString(vector2));
        System.out.println("La suma del vector 1 + vector 2 es igual a " + Arrays.toString(SumadeVectores));

    }

}
