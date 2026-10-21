public class Ejercicio13 { // Declara la clase
    public static void main(String[] args) { // Método principal
        try { // OBLIGATORIO: el método llamado declara throws Exception
            esperar(); // Llama al método que puede fallar
        } catch (Exception e) { // Atrapa la excepción declarada
            System.out.println("Atrapada: " + e.getMessage()); // Muestra el mensaje
        } // Cierra el catch
    } // Cierra main
    static void esperar() throws Exception { // 'throws' AVISA que este método puede lanzar Exception
        throw new Exception("Algo salió mal en esperar()"); // Exception es checked: exige throws o try-catch
    } // Cierra el método
} // Cierra la clase