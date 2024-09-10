package ProyectosdeClase;

import java.util.Scanner;

public class Operaciones {

// Método para mostrar el menú de operaciones
    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione la operacion a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Finalizar");

        return scanner.nextInt();
    }

// Método para ejecutar la operación seleccionada
    public static double ejecutarOperacion(int seleccion, double num1, double num2) {
        double resultado = 0;

        switch (seleccion) {
            case 1:
                resultado = Operaciones.sumar(num1, num2);
                break;
            case 2:
                resultado = Operaciones.restar(num1, num2);
                break;
            case 3:
                resultado = Operaciones.multiplicar(num1, num2);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = Operaciones.dividir(num1, num2);
                } else {
                    System.out.println("Error: División por cero.");
                    return 0;
                }
                break;
            case 5:
                break;
            default:
                System.out.println("Selección no válida.");
                return 0;
        }

        return resultado;
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
