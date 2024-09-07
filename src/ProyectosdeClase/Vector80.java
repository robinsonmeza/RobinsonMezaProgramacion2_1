package ProyectosdeClase;

public class Vector80 {

    public static void main(String[] args) {
        // 1. Genera un vector de 80 elementos.
        int[] vector = new int[80];

        // Solicitar y validar los valores de A y B
        int[] valores = VectoresMet.solicitarValores();
        int A = valores[0];
        int B = valores[1];

        // 2. Llenarlo aleatoriamente con números entre A y B
        VectoresMet.llenarVectorAleatorio(vector, A, B);

        // 3. Mostrar el vector
        VectoresMet.mostrarVector(vector);
    }
}
