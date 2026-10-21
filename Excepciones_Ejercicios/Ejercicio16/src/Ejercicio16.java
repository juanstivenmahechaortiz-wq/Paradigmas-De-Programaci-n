public class Ejercicio16 { // Declara la clase
    public static void main(String[] args) { // Método principal
        try { // Bloque vigilado
            procesar("xyz"); // Llama con dato inválido
        } catch (NumberFormatException e) { // Recibe el error relanzado
            System.out.println("main resuelve: " + e.getMessage()); // Resuelve en el nivel superior
        } // Cierra el catch
    } // Cierra main
    static void procesar(String s) { // Método intermedio
        try { // Bloque vigilado
            Integer.parseInt(s); // Falla con "xyz"
        } catch (NumberFormatException e) { // Atrapa para registrar
            System.out.println("LOG: error al procesar '" + s + "'"); // Deja registro
            throw e; // RELANZA la misma excepción hacia arriba
        } // Cierra el catch
    } // Cierra el método
} // Cierra la clase