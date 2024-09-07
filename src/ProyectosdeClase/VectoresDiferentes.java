/*
 Dados dos vectores uno de 15 y otro de 20 llenarlos, mostrar estos vectores
en un solo vector con todos sus elementos.
 */
package ProyectosdeClase;

public class VectoresDiferentes {

    public static void main(String[] args) {
        int[] VectorMenor = new int[15];
        int[] VectorMayor = new int[20];
        int[] VectorConjunto = new int[35];

        VectoresMet.LLenarVectorAleatoreo(VectorMenor);
        VectoresMet.LLenarVectorAleatoreo(VectorMayor);

        System.arraycopy(VectorMayor, 0, VectorConjunto, 0, VectorMayor.length);
        System.arraycopy(VectorMenor, 0, VectorConjunto, VectorMayor.length, VectorMenor.length);

        System.out.println("--------------------------------------------");
        VectoresMet.mostrarVector(VectorMenor);
        System.out.println("--------------------------------------------");
        VectoresMet.mostrarVector(VectorMayor);
        System.out.println("--------------------------------------------");

        VectoresMet.mostrarVector(VectorConjunto);
    }

}
