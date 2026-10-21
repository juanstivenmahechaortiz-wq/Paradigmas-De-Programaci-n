public class Ejercicio1 { // Declara la clase principal
    public static void main(String[] args) { // Punto de entrada del programa
        int a = 10; // Guarda el numerador
        int b = 0; // Guarda el denominador (cero a propósito)
        System.out.println("Antes de dividir"); // Esta línea SÍ se ejecuta
        int r = a / b; // ERROR: división entre cero, lanza ArithmeticException
        System.out.println("Resultado: " + r); // NUNCA se ejecuta: el programa ya se cayó
        System.out.println("Fin"); // NUNCA se ejecuta
    } // Cierra main
}