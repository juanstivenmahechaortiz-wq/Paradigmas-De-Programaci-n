class SaldoInsuficienteException extends Exception { // Hereda de Exception: es CHECKED
    private double faltante; // Atributo extra: cuánto dinero falta
    public SaldoInsuficienteException(String mensaje, double faltante) { // Constructor con mensaje y faltante
        super(mensaje); // Envía el mensaje a la clase padre
        this.faltante = faltante; // Guarda el valor faltante
    } // Cierra el constructor
    public double getFaltante() { // Getter para consultar el faltante
        return faltante; // Devuelve el valor
    } // Cierra el getter
} // Cierra la clase de la excepción
public class Ejercicio18 { // Clase principal
    public static void main(String[] args) { // Método principal
        double saldo = 50000; // Saldo disponible
        try { // OBLIGATORIO por ser checked
            retirar(saldo, 80000); // Intenta retirar más de lo que hay
        } catch (SaldoInsuficienteException e) { // Atrapa nuestra excepción
            System.out.println(e.getMessage()); // Muestra el mensaje
            System.out.println("Faltan: $" + e.getFaltante()); // Usa el dato extra de la excepción
        } // Cierra el catch
    } // Cierra main
    static void retirar(double saldo, double monto) throws SaldoInsuficienteException { // 'throws' obligatorio
        if (monto > saldo) { // Regla: no se puede retirar más del saldo
            throw new SaldoInsuficienteException("Saldo insuficiente", monto - saldo); // Lanza con el faltante
        } // Cierra el if
        System.out.println("Retiro exitoso"); // Caso correcto
    } // Cierra el método
} // Cierra la clase