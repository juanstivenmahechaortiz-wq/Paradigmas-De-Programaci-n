/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busqueda_lineal;

public class Busqueda_Lineal {

   public static int buscar(int[] arreglo, int objetivo){
       for(int i = 0; i < arreglo.length; i++){
           if (arreglo[i] == objetivo) {
               return i; //Elemento encontrado en el indice
           }
       }
       return -1; //Elemento no encontrado
   }
   public static void selectionSort(int[]arr){
        int n = arr.length;
        for (int i = 0 ; i < n - 1 ; i++){
            int minIndex = i; //Inicializa el indice del minimo
            for(int j = i + 1; j < n ; j++){
                if (arr[j] < arr[minIndex]) {//Encuentra el índice del minimo
                    minIndex = j;
                }
            }
            //Intercambia el elemento minimo encontrado con el primer elemento no ordenado
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }  
   
    public static void main(String[] args) {
        int[] arreglo = { 11,7,2,3,10};
        int objetivo = 10;
        selectionSort(arreglo);//Esto ordena el arreglo y los ubica en su posición
        int resultado = buscar(arreglo, objetivo);// una vez ordenado este busca el objetivo e indica su posicion en el arreglo.
        if (resultado != -1) {
           System.out.println("Elemento encontrado en el indice: " + resultado); 
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }  
}
