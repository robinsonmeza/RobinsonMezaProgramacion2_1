/*
Realizar un programa lea 15 letras y las almacene en un vector.
Posteriormente, el programa debe mostrar las letras en pantalla, pero, en
secuencia invertida en otro vector.
Ejemplo:
Si la entrada es: algoritmos La salida será: somtirogla
 */
package ProyectosdeClase;

import java.util.Scanner;

public class VectorPalabra {

    public static void main(String[] args) {
        Scanner Letra = new Scanner(System.in);
        char[] vector = new char[10];

        // Leer 15 letras y almacenarlas en el vector
        System.out.println("Ingrese 15 letras:");
        for (int i = 0; i < 10; i++) {
            vector[i] = Letra.next().charAt(0);
        }

        // Invertir el vector utilizando el método de VectoresMet
        char[] vectorInverso = VectoresMet.InvertirCaracter(vector);

        // Mostrar los valores del primer vector
        System.out.println("Vector original:");
        for (char c : vector) {
            System.out.print(c);
        }
        System.out.println();

        // Mostrar los valores del segundo vector (inverso)
        System.out.println("Vector inverso:");
        for (char c : vectorInverso) {
            System.out.print(c);
        }
        System.out.println();

        Letra.close();

    }

}
