public class Ejercicio4 { // Declara la clase
    public static void main(String[] args) { // Método principal
        String nombre = null; // La variable existe pero no apunta a ningún texto
        try { // Bloque vigilado
            int largo = nombre.length(); // Pedir length() a un null lanza NullPointerException
            System.out.println(largo); // No se ejecuta
        } catch (NullPointerException e) { // Atrapa el uso de null
            System.out.println("La variable nombre está vacía (null)"); // Mensaje claro
        } // Cierra el catch
    } // Cierra main
} // Cierra la clase