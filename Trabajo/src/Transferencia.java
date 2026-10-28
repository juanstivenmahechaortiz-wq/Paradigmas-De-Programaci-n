public class  Transferencia implements MetodoPago{
    @Override
    public void pagar(double valor){
        System.out.println("Pago " + valor +" con transferencia");
    }

}
