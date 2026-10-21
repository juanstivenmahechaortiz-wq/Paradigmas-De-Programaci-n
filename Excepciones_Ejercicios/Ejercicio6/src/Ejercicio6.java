public class Ejercicio6 { // Declara la clase
    public static void main(String[] args) { // Método principal
        Object objeto = "Hola"; // Un Object que en realidad guarda un String
        try { // Bloque vigilado

            Integer n = (Integer) objeto; // Forzar String a Integer es imposible: lanza ClassCastException
            System.out.println(n); // No se ejecuta
        } catch (ClassCastException e) { // Atrapa el cast inválido
            System.out.println("No puedes convertir un String en Integer"); // Mensaje claro
        } // Cierra el catch
    } // Cierra main
} // Cierra la clase