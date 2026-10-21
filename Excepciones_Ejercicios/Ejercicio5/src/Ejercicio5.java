public class Ejercicio5 { // Declara la clase
    public static void main(String[] args) { // Método principal
        String texto = "abc"; // Texto que NO es un número
        try { // Bloque vigilado
            int numero = Integer.parseInt(texto); // Intenta convertir; falla y lanza NumberFormatException
            System.out.println("Número: " + numero); // No se ejecuta
        } catch (NumberFormatException e) { // Atrapa la conversión inválida
            System.out.println("'" + texto + "' no es un número válido"); // Informa al usuario
        } // Cierra el catch
    } // Cierra main
}