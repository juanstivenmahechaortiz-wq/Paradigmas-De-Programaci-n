public class Cajero {

    private double saldo;
    private int pin;

    public Cajero(double saldo, int pin) {
        this.saldo = saldo;
        this.pin = pin;
    }

    public void iniciarSesion(int pinIngresado)
        throws PinIncorrectoException {
        if (pinIngresado != this.pin) {
            throw new PinIncorrectoException("El PIN ingresado es incorrecto.");
        }
        System.out.println("Bienvenido al Cajero Automatico");
    }

    public void retirar(double monto)
            throws SaldoInsuficienteException {

        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar tiene que ser mayor a 0.");
        }
        if (monto > saldo) {
            throw new SaldoInsuficienteException("No cuenta con el saldo suficiente para este retiro.");
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo);
    }

    public void consignar(double monto) {
        if (monto <= 0) {
            System.out.println("Error, el monto tiene que ser mayor a 0.");
        } else {
            saldo += monto;
            System.out.println("Consignación exitosa. Tu saldo actual es de: $" + saldo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }
}
