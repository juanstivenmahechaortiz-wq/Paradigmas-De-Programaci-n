import java.util.Arrays;

public class Main {
    //Metodo principal para ordenar un array usando Merge Sort
    public static void  mergeSort(int[]arr){
        if (arr.length < 2){
            return; //Caso base: el array ya esta ortdenado
        }
        int mid = arr.length /2; //Encuentra el punto medio
        int[] left = Arrays.copyOfRange(arr,0,mid); //Crea el sub-array izquierdo
        int[] right = Arrays.copyOfRange(arr, mid, arr.length); //Crea el sub-array derecho

        mergeSort(left); //Ordena el sub-array izquierdo
        mergeSort(right); //Ordena el sub-array derecho

        merge(arr, left, right); //Combina los sub-arrays ordenados
    }
    //Metodo para combinar dos sub-arrays ordenados
    private static void merge(int[]arr, int[] left, int[] right){
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length){
            if (left[i] <= right[j]){
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length){
            arr[k++] = left[i++];
        }
        while (j < right.length){
            arr[k++] = right[j++];
        }
    }
    public static void main(String[] args){
        int[] userNames = {42,35,50,18,29}; //Array de identificadores de usuarios
        mergeSort(userNames); //Ordena los identificadores usando Merge Sort
        System.out.println("Usuarios ordenados: " + Arrays.toString(userNames));
    }
}