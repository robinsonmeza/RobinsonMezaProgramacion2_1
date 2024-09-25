package ProyectosdeClase;

import java.util.Random;
import java.util.Scanner;

public class MetodosMat {

    public static int[][] llenarMatrizAleatoria(int filas, int columnas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor minimo");
        int minValor = sc.nextInt();
        
        System.out.println("Ingrese el valor maximo");
        int maxValor = sc.nextInt();

        
        int[][] matriz = new int[filas][columnas];

        Random rand = new Random();

        // ciclo para llenar con valores aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt((maxValor - minValor) + 1) + minValor;
            }
        }

        return matriz; // Devolver la matriz llena
    }

    public static void MostrarMatrizFilas(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            System.out.println("La matriz esta vacia o es nula.");
            return;
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
        System.out.println(); // Línea extra al final para separar
    }

    public static void MostrarMatrizColumna(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            System.out.println("La matriz esta vacia o es nula.");
            return;
        }

        for (int j = 0; j < matriz[0].length; j++) { // Cambiado para recorrer las columnas
            for (int i = 0; i < matriz.length; i++) { // Cambiado para recorrer las filas
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[] DimensionesdeMatriz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas:");
        int filas = sc.nextInt();

        System.out.println("Ingrese la cantidad de columnas:");
        int columnas = sc.nextInt();

        return new int[]{filas, columnas};
    }

    public static void MostrarMatrizFila(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            System.out.println("La matriz esta vacia o es nula.");
            return;
        }

        for (int i = 0; i < matriz[0].length; i++) { // Cambiado para recorrer las columnas
            for (int j = 0; j < matriz.length; j++) { // Cambiado para recorrer las filas
                System.out.print("[" + matriz[j][i] + "] ");
            }
            System.out.println();
        }
        System.out.println();
    }
}






