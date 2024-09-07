/*
 Realizar un programa que lea 10 números y los almacene en un vector.
Después debe devolver los valores y mostrar un inverso guardado en un
segundo vector.
Ejemplo:
𝑣 = {8, 4, 2, 6, 0, 1, 7, 6, 6, 5} 𝑣−1 = {5, 6, 6, 7, 1, 0, 6, 2, 4, 8}

 */
package ProyectosdeClase;

import java.util.Scanner;

public class VectorInverso {

    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int[] vector = new int[10];

        // Leer 10 numeros y almacenarlos en el vector
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            vector[i] = data.nextInt();
        }

        // Invertir el vector utilizando el metodo de VectoresMet
        int[] VectorInverso = VectoresMet.InvertirVector(vector);

        // Mostrar los valores del primer vector
        System.out.println("Vector original:");
        VectoresMet.mostrarVector(vector);

        // Mostrar los valores del segundo vector (inverso)
        System.out.println("Vector inverso:");
        VectoresMet.mostrarVector(VectorInverso);

        data.close();
    }
}
