public class Ejercicio8 { // Declara la clase
    public static void main(String[] args) { // Método principal
        try { // Bloque vigilado
            System.out.println("1. Dentro del try"); // Se ejecuta primero
            int r = 10 / 0; // Lanza ArithmeticException
            System.out.println("2. No se imprime");// Se salta
        } catch (ArithmeticException e) { // Atrapa el error
            System.out.println("3. Dentro del catch"); // Se ejecuta
        } finally { // Bloque final
            System.out.println("4. Dentro del finally (siempre)"); // Se ejecuta haya o no error
        } // Cierra finally
        System.out.println("5. Después de todo"); // El programa sigue

    } // Cierra main
} // Cierra la clase