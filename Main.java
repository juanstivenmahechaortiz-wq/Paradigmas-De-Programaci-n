import java.util.Arrays;
public class Main {
    //metodo principal para ordenar un array usando Quick Sort
    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pl = partition(arr, low, high); //Obtiene el indice de partición.
            quickSort(arr, low, pl - 1); // Ordena la parte izquierda.
            quickSort(arr, pl + 1, high); //Ordena la parte derecha.

        }
    }

    //Metodo para particionar el array
    private static int partition(int[] arr, int low, int high){
        int pivot = arr[high]; //Elige el ultimo elemento como pivote.
        int i = (low - 1); //Indice del elemento más pequeño
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) { //Compara con el pivote
                i++;
                //Intercambia los elementos
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Intercambia el pivote con el elemento en la posición correcta
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1; // Devuelve
    }

    public static void main(String[] args){
        int[] prices = {200,50,120,30,80}; //Array precios
        quickSort(prices, 0,prices.length - 1); //Ordena el array usando Quick Sort
        System.out.println("Precios ordenados: " + Arrays.toString(prices));
    }
}