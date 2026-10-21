public class Ejercicio15 { // Declara la clase
    public static void main(String[] args) { // Método principal
        try { // Aquí finalmente se atrapa el error
            metodoA(); // main llama a A
        } catch (ArithmeticException e) { // Atrapa lo que venga desde abajo
            System.out.println("main atrapó: " + e.getMessage()); // Imprime el mensaje
        } // Cierra el catch
    } // Cierra main
    static void metodoA() { // Método A
        System.out.println("Entrando a A"); // Se imprime
        metodoB(); // A llama a B
        System.out.println("Saliendo de A"); // NO se imprime: el error pasa de largo
    } // Cierra A
    static void metodoB() { // Método B
        System.out.println("Entrando a B"); // Se imprime
        int x = 1 / 0; // Se lanza el error AQUÍ; B no lo atrapa
        System.out.println("Saliendo de B"); // NO se imprime
    } // Cierra B
} // Cierra la clase