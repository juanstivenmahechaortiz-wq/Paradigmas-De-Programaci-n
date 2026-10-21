public class Ejercicio2 { // Declara la clase
    public static void main(String[] args) { // Método principal
        int a = 10; // Numerador
        int b = 0; // Denominador cero
        try { // Inicia el bloque vigilado
            int r = a / b; // Aquí ocurre la excepción
            System.out.println("Resultado: " + r); // Se salta porque hubo error arriba
        } catch (ArithmeticException e) { // Atrapa solo errores aritméticos; 'e' es el objeto error
            System.out.println("No se puede dividir entre cero"); // Mensaje amigable
        } // Cierra el catch
        System.out.println("El programa continúa");// Se ejecuta: el programa se recuperó
    } // Cierra main
} // Cierra la clase