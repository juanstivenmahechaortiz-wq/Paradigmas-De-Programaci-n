import java.util.InputMismatchException; // Excepción por tipo de dato incorrecto
import java.util.Scanner; // Para leer del teclado
public class Ejercicio22 { // Declara la clase
    public static void main(String[] args) { // Método principal
        Scanner teclado = new Scanner(System.in); // Lector de teclado
        int numero = 0; // Aquí se guardará el número válido
        boolean valido = false; // Bandera: ¿ya tenemos un dato válido?
        do { // Repite al menos una vez
            try { // Bloque vigilado
                System.out.print("Digite un entero: "); // Pide el dato
                numero = teclado.nextInt(); // Lanza InputMismatchException si no es entero
                        valido = true; // Solo llega aquí si NO hubo error
            } catch (InputMismatchException e) { // Atrapa el dato incorrecto
                System.out.println("Eso no es un entero. Intente de nuevo."); // Avisa al usuario
                teclado.nextLine(); // LIMPIA el dato malo del buffer (si no, el ciclo sería infinito)
            } // Cierra el catch
        } while (!valido); // Repite mientras no sea válido
        System.out.println("Gracias, digitó: " + numero); // Confirma el dato final
    } // Cierra main
} // Cierra la clase