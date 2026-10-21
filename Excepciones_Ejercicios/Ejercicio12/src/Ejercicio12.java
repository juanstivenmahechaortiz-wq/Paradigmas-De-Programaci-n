public class Ejercicio12 { // Declara la clase
    public static void main(String[] args) { // Método principal
        double[] notas = {4.5, 6.0, -1.0}; // Notas de prueba: una válida y dos inválidas
        for (double nota : notas) { // Recorre cada nota
            try { // Bloque vigilado
                registrarNota(nota); // Intenta registrar la nota
            } catch (IllegalArgumentException e) { // Atrapa la nota inválida
                System.out.println("Rechazada: " + e.getMessage()); // Informa el motivo
            } // Cierra el catch
        } // Cierra el for
    } // Cierra main
    static void registrarNota(double nota) { // Método que registra una nota
        if (nota < 0.0 || nota > 5.0) { // Fuera del rango permitido
            throw new IllegalArgumentException("Nota fuera de rango (0.0 - 5.0): " + nota); // Lanza el error
        } // Cierra el if

        System.out.println("Nota registrada: " + nota); // Nota correcta
    } // Cierra el método
} // Cierra la clase