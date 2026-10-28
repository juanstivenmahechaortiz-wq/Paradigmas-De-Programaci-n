public class Tarjeta implements MetodoPago{
    @Override
    public void pagar(double valor){
        System.out.println("Pago "+ valor + " con tarjeta.");
    }
}
