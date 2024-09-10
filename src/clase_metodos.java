package ProyectosdeClase;

import java.util.Scanner;

public class clase_metodos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Ingrese el primer numero:");
            double num1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo numero:");
            double num2 = scanner.nextDouble();

// Llamada a el menú
            int seleccion = Operaciones.mostrarMenu();

            if (seleccion == 5) {
                System.out.println("Finalizando...");
                break;
            }

// Llamada a la ejecucion la operación seleccionada
            double resultado = Operaciones.ejecutarOperacion(seleccion, num1, num2);

            if (resultado != 0 || seleccion == 4) {
                System.out.println("El resultado es: " + resultado);
            }
        } while (true);
    }
}
