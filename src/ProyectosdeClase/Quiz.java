/*
Llenar aleatoreamente dos vectores A y B de n y m rango respectivamente (n y m dados por teclado) 
Supongase que los vectores A y B representan conjuntos (eliminar los repetidos de cada vector
y hallar las siguientes operaciones entre conjuntos:
 -A intersectado con B Valores del primero que estan en el segundo
 -A unido con B valores del primero y del segundo en un solo vector (sin repetidos)
 - (A-B) los valores qu7e estan en A y que no estan en B
 -A diferencia simetrica con B, son los que estan en A que no estan en B y los que estan en B que no estan en A.

 */
package ProyectosdeClase;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Valor para el Vector A (n):");
        int n = scanner.nextInt();
        System.out.println("Ingrese Valor para el Vector B (m):");
        int m = scanner.nextInt();

        int[] vectorA = new int[n];
        int[] vectorB = new int[m];

        int[] rango = VectoresMet.solicitarValores();
        int A = rango[0];
        int B = rango[1];

        VectoresMet.llenarVectorAleatorio(vectorA, A, B);
        VectoresMet.llenarVectorAleatorio(vectorB, A, B);

        System.out.println("Vector Base A");
        VectoresMet.mostrarVector(vectorA);

        System.out.println("Vector Base B");
        VectoresMet.mostrarVector(vectorB);

        ArrayList<Integer> conjuntoA = new ArrayList<>();
        ArrayList<Integer> conjuntoB = new ArrayList<>();
        for (int num : vectorA) {
            if (!conjuntoA.contains(num)) {
                conjuntoA.add(num);
            }
        }

        for (int num : vectorB) {
            if (!conjuntoB.contains(num)) {
                conjuntoB.add(num);
            }
        }

        // A interseccion B
        ArrayList<Integer> interseccion = new ArrayList<>();
        for (int num : conjuntoA) {
            if (conjuntoB.contains(num)) {
                interseccion.add(num);
            }
        }

        // A union B
        ArrayList<Integer> union = new ArrayList<>(conjuntoA);
        for (int num : conjuntoB) {
            if (!union.contains(num)) {
                union.add(num);
            }
        }

        // A - B
        ArrayList<Integer> diferencia = new ArrayList<>();
        for (int num : conjuntoA) {
            if (!conjuntoB.contains(num)) {
                diferencia.add(num);
            }
        }

        // A diferencia simetrica B
        ArrayList<Integer> diferenciaSimetrica = new ArrayList<>();
        for (int num : conjuntoA) {
            if (!conjuntoB.contains(num)) {
                diferenciaSimetrica.add(num);
            }
        }

        for (int num : conjuntoB) {
            if (!conjuntoA.contains(num)) {
                diferenciaSimetrica.add(num);
            }
        }

        // Mostrar Respuesta
        System.out.println("La interseccion de A en B:");
        VectoresMet.mostrarConjunto(interseccion);

        System.out.println("La union de A y B:");
        VectoresMet.mostrarConjunto(union);

        System.out.println("A menos B:");
        VectoresMet.mostrarConjunto(diferencia);

        System.out.println("La diferencia simetrica de A y B:");
        VectoresMet.mostrarConjunto(diferenciaSimetrica);

        scanner.close();
    }
}
