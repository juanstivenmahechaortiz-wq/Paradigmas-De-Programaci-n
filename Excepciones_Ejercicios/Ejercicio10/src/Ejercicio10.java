public class Ejercicio10 { // Declara la clase
    public static void main(String[] args) { // Método principal
        try { // Bloque vigilado
            Object o = "texto"; // Un String guardado en un Object
            Integer n = (Integer) o; // Cast inválido: lanza ClassCastException
        } catch (Exception e) { // Atrapa cualquier excepción
            System.out.println("getMessage: " + e.getMessage()); // Solo el mensaje
            System.out.println("toString: " + e.toString()); // Tipo + mensaje
            System.out.println("Clase: " + e.getClass().getName());// Nombre completo del tipo
            e.printStackTrace(); // Imprime la ruta completa del error (útil para depurar)
        } // Cierra el catch

    } // Cierra main
} // Cierra la clase