package ProyectosdeClase;

import java.util.Arrays;

public class VectorPorCeroPuntoCinco {

    public static void main(String[] args) {
        int[] vectorOriginal = new int[10];
        int[] vectorMultiplicado = new int[10];

        int A = 50;
        int B = 100;
        VectoresMet.llenarVectorAleatorio(vectorOriginal, A, B);

        // Llamar al método para multiplicar
        vectorMultiplicado = VectoresMet.MultiplicarVectorPorCeroPuntoCinco(vectorOriginal);

        System.out.println("Vector Original: " + Arrays.toString(vectorOriginal));
        System.out.println("Vector Multiplicado por 0.5: " + Arrays.toString(vectorMultiplicado));
    }

}
