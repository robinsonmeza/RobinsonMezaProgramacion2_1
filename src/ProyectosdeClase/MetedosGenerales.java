package ProyectosdeClase;

public class MetedosGenerales {

    public class Calculadora {

        
        public double Sumar(double num1, double num2) {
            return num1 + num2;
        }

      
        public double Restar(double num1, double num2) {
            return num1 - num2;
        }

        
        public double Multiplicar(double num1, double num2) {
            return num1 * num2;
        }

        
        public double Dividir(double num1, double num2) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
                return Double.NaN; 
            }
        }
    }
}
