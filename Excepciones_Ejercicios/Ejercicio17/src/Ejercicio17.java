class EdadInvalidaException extends RuntimeException { // Nuestra excepción: hereda de RuntimeException (unchecked)
    public EdadInvalidaException(String mensaje) { // Constructor que recibe el mensaje
        super(mensaje); // Pasa el mensaje a la clase padre
    } // Cierra el constructor
} // Cierra la clase de la excepción
public class Ejercicio17 { // Clase principal
    public static void main(String[] args) { // Método principal
        try { // Bloque vigilado
            crearPersona("Ana", 200); // Edad absurda
        } catch (EdadInvalidaException e) { // Atrapa NUESTRA excepción
            System.out.println("Error: " + e.getMessage()); // Muestra el mensaje
        } // Cierra el catch
    } // Cierra main
    static void crearPersona(String nombre, int edad) { // Método que crea una persona
        if (edad < 0 || edad > 120) { // Regla: edad entre 0 y 120
            throw new EdadInvalidaException("Edad no válida: " + edad); // Lanza nuestra excepción
        } // Cierra el if
        System.out.println(nombre + " tiene " + edad + " años"); // Caso correcto
    } // Cierra el método
} // Cierra la clase