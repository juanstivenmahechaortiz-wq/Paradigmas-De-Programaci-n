import java.util.Scanner;

class SaldoNegativoException extends Exception {
    public SaldoNegativoException(String mensaje) {
        super(mensaje);
    }
}
public class Main {


    public static void main(String[] args) throws SaldoNegativoException{
    Scanner teclado = new Scanner(System.in);

    MetodoPago pago1 = new Tarjeta();
    MetodoPago pago2 = new Efectivo();
    MetodoPago pago3 = new Transferencia();

        System.out.println("Escoja el metodo de pago:");
        System.out.println("1. Tarjeta\n2. Efectivo\n3. Transferencia");
        int met = teclado.nextInt();
        teclado.nextLine();
      try {

          switch (met) {
              case 1: {
                  System.out.println("Cual es el valor del pago?");
                  System.out.print("Valor:");
                  double valor = teclado.nextDouble();
                  pago1.pagar(valor);
              }
              break;
              case 2: {
                  System.out.println("Cual es el valor del pago?");
                  System.out.print("Valor:");
                  double valor = teclado.nextDouble();
                  pago2.pagar(valor);
              }
              break;
              case 3: {
                  System.out.println("Cual es el valor del pago?");
                  System.out.print("Valor:");
                  double valor = teclado.nextDouble();
                  pago3.pagar(valor);
              }
              break;
              default:
          }
      } catch (IllegalArgumentException e){
          System.out.println("Error: "+ e.getMessage());
      }

    }

}