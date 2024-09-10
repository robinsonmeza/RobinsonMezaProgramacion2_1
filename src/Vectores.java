package ProyectosdeClase;
//dado un vector 20 elementos mostrar aleatoriamente

public class Vectores {

    public static void main(String[] args) {
        // Generar un vector de 50 elementos
        int[] vector = new int[20];

        // Llenar el vector aleatoriamente en forma ascendente
        VectoresMet.LLenarVectorAleatoreo(vector);

        // Mostrar el vector en forma aleatorea
        VectoresMet.mostrarVectorPar(vector);
    }
}
