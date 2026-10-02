/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamiento_insercion;

import java.util.Arrays;

public class Ordenamiento_Insercion {


    //Metodo para ordenar un Array usando el algoritmo de selección
    
    public static void insertionSort(int[]arr){
        int n = arr.length;
        for (int i = 1 ; i < n ; i++){
                int key = arr[i]; // Elemento a insertar
                int j = i - 1;
                while (j >= 0 && arr[j] > key){ //Mueve elementos mayores a la derecha
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = key; //Inserta el elemento en la posición correcta
            }
        }
        public static void main(String[] args){
            int[] ages = {23,30,18,25,27}; //Array de edades
            insertionSort(ages);
            System.out.println("Edades ordenadas: " + Arrays.toString(ages));
        }
    }


