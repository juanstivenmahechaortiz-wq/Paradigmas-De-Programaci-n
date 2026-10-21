class FondosInsuficientesException extends Exception { // Excepción checked propia
    public FondosInsuficientesException(String m) { // Constructor con mensaje
        super(m); // Pasa el mensaje al padre
    } // Cierra el constructor
} // Cierra la clase
class Cuenta { // Clase que modela una cuenta
    private double saldo; // Saldo privado (encapsulado)
    public Cuenta(double saldoInicial) { // Constructor
        this.saldo = saldoInicial; // Asigna el saldo inicial
    } // Cierra el constructor
    public void depositar(double monto) { // Método para depositar
        if (monto <= 0) { // Validación: monto positivo
            throw new IllegalArgumentException("El depósito debe ser positivo"); // Unchecked: error del programador
        } // Cierra el if
        saldo += monto; // Suma al saldo
    } // Cierra depositar
    public void retirar(double monto) throws FondosInsuficientesException { // Checked: situación del negocio
        if (monto > saldo) { // Verifica el saldo
            throw new FondosInsuficientesException("Fondos insuficientes. Saldo: " + saldo);
// Lanza
        } // Cierra el if
        saldo -= monto; // Resta del saldo
    } // Cierra retirar
    public double getSaldo() { // Consulta el saldo
        return saldo; // Devuelve el saldo
    } // Cierra el getter
} // Cierra la clase Cuenta
public class Ejercicio19 { // Clase principal
    public static void main(String[] args) { // Método principal
        Cuenta c = new Cuenta(100000); // Crea cuenta con $100.000
        try { // Bloque vigilado
            c.depositar(20000); // Depósito válido
            c.retirar(50000); // Retiro válido
            c.retirar(200000); // Retiro inválido: lanza la checked
        } catch (FondosInsuficientesException e) { // Atrapa la checked
            System.out.println(e.getMessage()); // Muestra el mensaje
        } catch (IllegalArgumentException e) { // Atrapa la unchecked
            System.out.println("Dato inválido: " + e.getMessage()); // Muestra el mensaje
        } finally { // Siempre se ejecuta
            System.out.println("Saldo final: " + c.getSaldo()); // Reporta el saldo final
        } // Cierra el finally
    } // Cierra main
} // Cierra la clase