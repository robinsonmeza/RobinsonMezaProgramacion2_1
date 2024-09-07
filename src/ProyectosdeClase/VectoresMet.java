package ProyectosdeClase;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VectoresMet {

    // Método para solicitar y validar los valores de A y B
    public static int[] solicitarValores() {
        Scanner scanner = new Scanner(System.in);
        int A, B;

        do {
            System.out.println("Ingrese el valor A:");
            A = scanner.nextInt();
            System.out.println("Ingrese el valor B (debe ser mayor que A):");
            B = scanner.nextInt();

            if (B <= A) {
                System.out.println("El valor de B debe ser mayor que A. Inténtelo de nuevo.");
            }
        } while (B <= A);

        return new int[]{A, B};
    }

    // llenar el vector aleatoriamente con números entre A y B
    public static void llenarVectorAleatorio(int[] vector, int A, int B) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = A + (int) (Math.random() * (B - A + 1));
        }
    }

    // llenar el vector aleatoriamente en forma ascendente
    public static void llenarVectorAleatorioAscendente(int[] vector, int A, int B) {
        llenarVectorAleatorio(vector, A, B);
        Arrays.sort(vector);
    }

    // Mostrar el vector
    public static void mostrarVector(int[] vector) {
        for (int num : vector) {
            System.out.print("[]" + num + "\n");
        }
        System.out.println();
    }

    // Mostrar el vector en forma descendente
    public static void mostrarVectorDescendente(int[] vector) {
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    // imprime aleatoreamente y solo muestra pares

    public static void mostrarVectorPar(int[] vector) {
        for (int num : vector) {
            if (num % 2 == 0) {
                System.out.print("[]" + num + "\n");
            }
        }
        System.out.println();

    }

    public static void mostrarVectorImpar(int[] vector) {
        for (int num : vector) {
            if (num % 2 != 0) {
                System.out.print("[]" + num + "\n");
            }
        }
        System.out.println();

    }

    public static void LLenarVectorAleatoreo(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100);
        }

        System.out.println();
    }

    public static int[] InvertirVector(int[] vector) {
        int[] VectorInverso = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            VectorInverso[i] = vector[vector.length - 1 - i];
        }
        return VectorInverso;
    }

    public static char[] InvertirCaracter(char[] vector) {
        char[] vectorInverso = new char[vector.length];
        for (int i = 0; i < vector.length; i++) {
            vectorInverso[i] = vector[vector.length - 1 - i];
        }
        return vectorInverso;
    }

    public static void llenarVectorPares(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100) * 2;
        }
    }

    public static void llenarVectorImpares(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt((100) * 2) + 1;

        }
    }

    public static void VectorInvertido(int[] vector) {
        int start = 0;
        int end = vector.length - 1;
        while (start < end) {
            // Intercambiar los elementos
            int temp = vector[start];
            vector[start] = vector[end];
            vector[end] = temp;
            start++;
            end--;

        }
    }
}
