import java.io.File; // Clase que representa un archivo
import java.io.FileNotFoundException; // Excepción cuando el archivo no existe
import java.util.Scanner; // Para leer el contenido
public class Ejercicio14 { // Declara la clase
    public static void main(String[] args) { // Método principal
        try { // Bloque vigilado
            File archivo = new File("noexiste.txt"); // Referencia a un archivo inexistente
            Scanner lector = new Scanner(archivo); // Abrir el archivo lanza FileNotFoundException
            System.out.println(lector.nextLine()); // No se ejecuta
            lector.close(); // No se ejecuta
        } catch (FileNotFoundException e) { // Atrapa el archivo no encontrado
            System.out.println("No encontré el archivo: " + e.getMessage()); // Informa al usuario
        } // Cierra el catch
    } // Cierra main
} // Cierra la clase