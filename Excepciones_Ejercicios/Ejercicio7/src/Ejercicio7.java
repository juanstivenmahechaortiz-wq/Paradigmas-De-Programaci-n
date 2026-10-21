public class Ejercicio7 { // Declara la clase
    public static void main(String[] args) { // Método principal
        int[] datos = {5, 0}; // Arreglo con dos valores
        try { // Bloque vigilado
            int r = datos[0] / 1; // 5 / 0: lanza ArithmeticException
            System.out.println(r); // No se ejecuta
            System.out.println(datos[9]); // Tampoco se llega aquí
        } catch (ArithmeticException e) { // Primer catch: errores de cálculo
            System.out.println("Error aritmético: " + e.getMessage()); // Se ejecuta este
        } catch (ArrayIndexOutOfBoundsException e) { // Segundo catch: errores de índice
            System.out.println("Error de índice"); // No se ejecuta en este caso
        } catch (Exception e) { // Último: general, atrapa cualquier otra cosa
            System.out.println("Error inesperado"); // Red de seguridad (siempre al final)
        } // Cierra los catch
    } // Cierra main
} // Cierra la clase