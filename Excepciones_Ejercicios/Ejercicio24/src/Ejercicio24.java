public class Ejercicio24 { // Declara la clase
    public static void main(String[] args) { // Método principal
        System.out.println("Resultado: " + dividir(10, 2)); // Caso sin error
        System.out.println("Resultado: " + dividir(10, 0)); // Caso con error
    } // Cierra main
    static int dividir(int a, int b) { // Método que divide y devuelve un entero
        try { // Bloque vigilado
            return a / b; // Devuelve el cociente (falla si b == 0)
        } catch (ArithmeticException e) { // Atrapa la división por cero
            System.out.println("Error: división entre cero"); // Avisa
            return -1; // Devuelve -1 como señal de error
        } finally { // Se ejecuta ANTES de que el método devuelva el valor
            System.out.println("(finally ejecutado)"); // Aparece en ambos casos
        } // Cierra el finally
    } // Cierra el método
} // Cierra la clase