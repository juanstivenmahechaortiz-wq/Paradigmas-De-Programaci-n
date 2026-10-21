public class Ejercicio3 { // Declara la clase
    public static void main(String[] args) { // Método principal
        int[] numeros = {10, 20, 30}; // Arreglo con 3 posiciones: índices 0, 1 y 2
        try { // Bloque vigilado
            System.out.println(numeros[1]); // Índice válido: imprime 20
            System.out.println(numeros[5]); // Índice 5 NO existe: lanza la excepción
        } catch (ArrayIndexOutOfBoundsException e) { // Atrapa el índice inválido
            System.out.println("Índice fuera de rango: " + e.getMessage()); // Muestra el detalle del error
        } // Cierra el catch
        System.out.println("Fin"); // Continúa normalmente
    } // Cierra main
} // Cierra la clase