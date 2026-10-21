import java.util.Scanner; // Importa Scanner (implementa AutoCloseable)
public class Ejercicio21 { // Declara la clase
    public static void main(String[] args) { // Método principal
        try (Scanner lector = new Scanner("10 20 abc")) { // El recurso va entre paréntesis: se cierra SOLO al terminar
            int a = lector.nextInt(); // Lee 10
            int b = lector.nextInt(); // Lee 20
            System.out.println("Suma: " + (a + b));// Imprime 30
            int c = lector.nextInt(); // "abc" no es entero: lanza InputMismatchException
            System.out.println(c); // No se ejecuta
        } catch (java.util.InputMismatchException e) { // Atrapa el dato inesperado
            System.out.println("Se encontró un dato que no es entero"); // Mensaje claro
        } // El Scanner ya fue cerrado automáticamente
    } // Cierra main
} // Cierra la clase