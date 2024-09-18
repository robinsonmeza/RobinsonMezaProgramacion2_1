
package ProyectosdeClase;

public class OrdenamientodeVectores {

    public static void main(String[] args) {
        int[] vector = new int[10];

        VectoresMet.LLenarVectorAleatoreo(vector);
        System.out.println("Vector Original");
        VectoresMet.mostrarVector(vector);
        
        System.out.println("Vector Ordenado de Menor a Mayor");
        VectoresMet.OrdenarMenorAMayor(vector);
        VectoresMet.mostrarVector(vector);
        

    }

}
