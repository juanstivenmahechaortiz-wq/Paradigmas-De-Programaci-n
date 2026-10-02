/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busqueda_binaria;


public class Busqueda_Binaria {

   public static int buscar(int[] arreglo, int objetivo){
       int izquierda = 0;
       int derecha = arreglo.length - 1;
       while (izquierda <= derecha){
           int medio = izquierda + (derecha - izquierda)/2;
           
           if (arreglo[medio] == objetivo) {
               return medio; //Elemento encontrdo en el indice
           }
           
           if (arreglo[medio] < objetivo) {
               izquierda = medio + 1; //El objetivo esta en la mitad derecha
           } else {
               derecha = medio - 1; //El objetivo esta en la mitad izquierda
           }
       }
       return -1; //Elemento no encontrado
   }
    public static void main(String[] args) {
       int[] arreglo = {1,3,5,7,9,11,13,15};
       int objetivo = 7;
       int resultado = buscar(arreglo, objetivo);
        if (resultado != -1) {
            System.out.println("Elemento encontrado en el indice: " + resultado);
        } else{
            System.out.println("Elemento no encontrado.");
        }
    }
}
