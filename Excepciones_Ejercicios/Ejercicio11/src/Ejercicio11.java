public class Ejercicio11 { // Declara la clase
    public static void main(String[] args) { // Método principal
        try { // Bloque vigilado
            validarEdad(-5); // Llama al método con un dato inválido
        } catch (IllegalArgumentException e) { // Atrapa el error que lanzamos nosotros
            System.out.println("Error: " + e.getMessage()); // Muestra nuestro mensaje personalizado
        } // Cierra el catch
    } // Cierra main
    static void validarEdad(int edad) { // Método que valida una edad
        if (edad < 0) { // Condición de error: edad negativa
            throw new IllegalArgumentException("La edad no puede ser negativa"); // CREA y LANZA el objeto excepción
        } // Cierra el if
        System.out.println("Edad válida: " + edad);// Solo se ejecuta si la edad es correcta
    } // Cierra el método
} // Cierra la clase