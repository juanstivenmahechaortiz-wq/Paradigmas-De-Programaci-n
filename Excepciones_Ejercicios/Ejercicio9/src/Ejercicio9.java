public class Ejercicio9 { // Declara la clase
    public static void main(String[] args) { // Método principal
        String[] entradas = {"10", "abc", null}; // Tres entradas: válida, inválida y nula
        for (String s : entradas) { // Recorre cada entrada del arreglo
            try { // Bloque vigilado
                int n = Integer.parseInt(s.trim());// "abc" lanza NumberFormatException; null lanza NullPointerException al hacer trim()
                System.out.println("Número: " + n);// Solo se imprime si la conversión funcionó
            } catch (NumberFormatException | NullPointerException e) { // Un solo catch para ambos tipos (separados por |)
                System.out.println("Entrada inválida: " + s); // Misma respuesta para los dos errores
            } // Cierra el catch
        } // Cierra el for
    } // Cierra main
} // Cierra la clase