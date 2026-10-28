public class PagoMovil implements MetodoPago{

    @Override
    public void pagar(double valor){
        System.out.println("Pagaste " + valor + " con el celular");
    }
}
