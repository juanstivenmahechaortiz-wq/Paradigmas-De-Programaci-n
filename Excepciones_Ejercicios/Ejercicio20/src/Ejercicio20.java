class ErrorDeLecturaException extends Exception { // Excepción de alto nivel
    public ErrorDeLecturaException(String m, Throwable causa) { // Recibe mensaje y causa original
        super(m, causa); // Guarda ambos en la clase padre
    } // Cierra el constructor
} // Cierra la clase
public class Ejercicio20 { // Clase principal
    public static void main(String[] args) { // Método principal
        try { // Bloque vigilado
            leerEdad("veinte"); // Dato inválido
        } catch (ErrorDeLecturaException e) { // Atrapa la excepción de alto nivel
            System.out.println("Mensaje: " + e.getMessage()); // Mensaje del nivel alto
            System.out.println("Causa: " + e.getCause()); // La excepción original que provocó todo
        } // Cierra el catch
    } // Cierra main
    static void leerEdad(String s) throws ErrorDeLecturaException { // Declara la checked
        try { // Bloque vigilado
            int edad = Integer.parseInt(s); // Falla: NumberFormatException
            System.out.println("Edad: " + edad); // No se ejecuta
        } catch (NumberFormatException e) { // Atrapa el error de bajo nivel
            throw new ErrorDeLecturaException("No pude leer la edad", e); // Lo envuelve y lo relanza con su causa
        } // Cierra el catch
    } // Cierra el método
} // Cierra la clase