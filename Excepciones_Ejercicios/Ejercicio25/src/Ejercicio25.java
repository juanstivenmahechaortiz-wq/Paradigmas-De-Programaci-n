
class OperadorInvalidoException extends Exception { // Excepción propia (checked)
    public OperadorInvalidoException(String op) { // Constructor que recibe el operador malo
        super("Operador no soportado: " + op); // Construye el mensaje
    } // Cierra el constructor
} // Cierra la clase
public class Ejercicio25 { // Clase principal
    public static void main(String[] args) { // Método principal
        String[][] pruebas = { // Casos de prueba: {a, operador, b}
                {"8", "+", "2"}, // Válido
                {"8", "/", "0"}, // División por cero
                {"8", "%", "2"}, // Operador inválido
                {"ocho", "*", "2"} // Número inválido
        }; // Cierra la matriz
        for (String[] p : pruebas) { // Recorre cada caso
            try { // Bloque vigilado
                double r = calcular(p[0], p[1], p[2]); // Intenta calcular
                System.out.println(p[0] + " " + p[1] + " " + p[2] + " = " + r); // Muestra el resultado
            } catch (NumberFormatException e) { // Número mal escrito
                System.out.println("Número inválido en: " + p[0]); // Informa
            } catch (ArithmeticException e) { // División por cero
                System.out.println("Error: " + e.getMessage()); // Informa
            } catch (OperadorInvalidoException e) { // Nuestra excepción
                System.out.println(e.getMessage());// Informa
            } finally { // Siempre
                System.out.println("--- operación procesada ---"); // Separador
            } // Cierra el finally
        } // Cierra el for
    } // Cierra main
    static double calcular(String a, String op, String b) throws OperadorInvalidoException {
// Declara la checked
        double x = Double.parseDouble(a); // Puede lanzar NumberFormatException
        double y = Double.parseDouble(b); // Puede lanzar NumberFormatException
        switch (op) { // Elige según el operador
            case "+": return x + y; // Suma
            case "-": return x - y; // Resta
            case "*": return x * y; // Multiplicación
            case "/": // División
                if (y == 0) { // Doubles no lanzan error al dividir por 0, así que lo validamos
                    throw new ArithmeticException("No se puede dividir entre cero"); // Lanzamos nosotros
} // Cierra el if
        return x / y; // Divide
default: // Cualquier otro símbolo
        throw new OperadorInvalidoException(op); // Lanza la checked propia
} // Cierra el switch
        } // Cierra el método
        } // Cierra la clase