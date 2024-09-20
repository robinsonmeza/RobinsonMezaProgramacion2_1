package ProyectosdeClase;

import java.util.ArrayList;
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

    
    public static void llenarVectorAleatorioAscendente(int[] vector, int A, int B) {
        llenarVectorAleatorio(vector, A, B);
        Arrays.sort(vector);
    }

   
    public static void mostrarVector(int[] vector) {
        for (int num : vector) {
            System.out.print("[]" + num + "\n");
        }
        System.out.println();
    }

  
    public static void mostrarVectorDescendente(int[] vector) {
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
  

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

    public static int[] MultiplicarVectorPorCeroPuntoCinco(int[] vector) {
        int[] nuevoVector = new int[vector.length];
        for (int i = 0; i < vector.length; i++) {
            nuevoVector[i] = (int) (vector[i] * 0.5);
        }
        return nuevoVector;
    }

    public static int contarRepeticiones(int[] vector, int X) {
        int contador = 0;
        for (int num : vector) {
            if (num == X) {
                contador++;
            }
        }
        return contador;
    }

    public static void mostrarConjunto(ArrayList<Integer> conjunto) {
        for (int num : conjunto) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void OrdenarMenorAMayor(int[] vector) {
        int temp;
        for (int a = 0; a < vector.length; a++) {
            for (int primero = 0; primero < vector.length - a - 1; primero++) {
                if (vector[primero] > vector[primero + 1]) {
                    // Intercambiar elementos
                    temp = vector[primero];
                    vector[primero] = vector[primero + 1];
                    vector[primero + 1] = temp;
                }
            }
        }
    }

    public static void MostrarVentasMensuales(int[] ventas, String[] meses) {
        System.out.println("Ventas mensuales:");
        for (int i = 0; i < ventas.length; i++) {
            System.out.println(meses[i] + ": " + ventas[i]);
        }
    }

    public static String ObtenerMesVentasMaximas(int[] ventas, String[] meses) {
        int MesMaxVentas = EncontrarMesMaxVentas(ventas);
        return meses[MesMaxVentas];
    }

    public static int ObtenerVentasMaximas(int[] ventas) {
        int MesMaxVentas = EncontrarMesMaxVentas(ventas);
        return ventas[MesMaxVentas];
    }

    public static int CalcularTotalVentas(int[] ventas) {
        int TotalVentas = 0;
        for (int venta : ventas) {
            TotalVentas += venta;
        }
        return  TotalVentas;
    }

    public static double CalcularPromedioVentas(int[] ventas) {
        int TotalVentas = CalcularTotalVentas(ventas);
        return (double) TotalVentas / ventas.length;
    }

    private static int EncontrarMesMaxVentas(int[] ventas) {
        int MaxVentas = ventas[0];
        int MesMaxVentas = 0;
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > MaxVentas) {
                MaxVentas = ventas[i];
                MesMaxVentas = i;
            }
        }
        return MesMaxVentas;
    }
}
