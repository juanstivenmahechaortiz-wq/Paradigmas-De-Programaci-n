/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento_seleccion;

import java.util.Arrays;

public class Ordenamiento_Seleccion {
    //Metodo para ordenar un array usando el algoritmo de selección
    
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
       int[] numbers = {29,10,14,37,13}; //Array de numeros de productos
       selectionSort(numbers);//Ordena los numeros usando selection Sort
        System.out.println("Números ordenados: " + Arrays.toString(numbers));
    }
    
}
