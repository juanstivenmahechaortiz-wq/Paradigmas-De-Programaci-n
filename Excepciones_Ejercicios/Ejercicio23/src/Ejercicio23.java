public class Ejercicio23 { // Declara la clase
    public static void main(String[] args) { // Método principal
        try { // Bloque vigilado
            int[] v = new int[2]; // Arreglo de 2 posiciones
            v[5] = 1; // Lanza ArrayIndexOutOfBoundsException
        } catch (IndexOutOfBoundsException e) { // PADRE de ArrayIndexOutOfBoundsException: también la atrapa
            System.out.println("Atrapada por el padre: " + e.getClass().getSimpleName()); // Muestra el tipo REAL
        } // Cierra el catch
        try { // Segundo bloque vigilado
            Object o = null; // Variable nula
            o.toString(); // Lanza NullPointerException
        } catch (RuntimeException e) { // PADRE de NullPointerException
            System.out.println("RuntimeException atrapó a: " + e.getClass().getSimpleName());
// Tipo real
        } // Cierra el catch
        System.out.println("¿Es ArithmeticException una Exception? " + (new ArithmeticException() instanceof Exception)); // true
    } // Cierra main
} // Cierra la clase