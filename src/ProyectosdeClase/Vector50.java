
package ProyectosdeClase;

public class Vector50 {

    public static void main(String[] args) {
        // Generar un vector de 50 elementos
        int[] vector = new int[50];

        // Rango de números aleatorios
        int A = 0;
        int B = 1000;

        // Llenar el vector aleatoriamente en forma ascendente
        VectoresMet.llenarVectorAleatorioAscendente(vector, A, B);

        // Mostrar el vector en forma descendente
        VectoresMet.mostrarVectorDescendente(vector);
    }
}
