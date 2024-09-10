/*
Dados dos vectores A y B de 20 elementos cada uno. Llenarlos
aleatoriamente el primero con numero solo pares y el segundo con numero
solo impares. Mostrar los vectores.
 */
package ProyectosdeClase;

public class VectorPareImpar {

    public static void main(String[] args) {
        int[] vectorPar = new int[20];
        int[] vectorImpar = new int[20];

        VectoresMet.llenarVectorPares(vectorPar);
        VectoresMet.llenarVectorImpares(vectorImpar);

        VectoresMet.mostrarVector(vectorPar);
        VectoresMet.mostrarVector(vectorImpar);

    }

}
