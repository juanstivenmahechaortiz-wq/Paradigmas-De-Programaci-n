
import java.util.Scanner;

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}
class PinIncorrectoException extends Exception {
    public PinIncorrectoException(String mensaje) {
        super(mensaje);
    }
}
public class Main {


    public static void main(String[] args){

        Cajero miCajero = new Cajero(100000, 1234);

        Scanner teclado = new Scanner(System.in);
        int op = -1;
        do {
            System.out.println("||====================||");
            System.out.println("|| Cajero Automatico  ||");
            System.out.println("|| 1. INICIAR SESIÓN  ||");
            System.out.println("|| 2. INFORMACIÓN     ||");
            System.out.println("|| 3. Salir           ||");
            System.out.println("||====================||");
            System.out.println("Seleccione una opción:");
            op = teclado.nextInt();
            teclado.nextLine();
             switch (op){
                 case 1: {
                     System.out.println("Ingrese pin de cuenta");
                     int pinIngresado = teclado.nextInt();

                     try {
                         miCajero.iniciarSesion(pinIngresado);
                     } catch (PinIncorrectoException e){
                         System.out.println("Error: " + e.getMessage());
                     }
                     do {
                         System.out.println("||====================||");
                         System.out.println("|| Cajero Automatico  ||");
                         System.out.println("|| 1. Retiros         ||");
                         System.out.println("|| 2. Consignaciones  ||");
                         System.out.println("|| 3. Consultar saldo ||");
                         System.out.println("|| 4. Volver al menu  ||");
                         System.out.println("||====================||");
                         System.out.println("Seleccione una opción:");
                         op = teclado.nextInt();
                         teclado.nextLine();
                         switch (op){
                             case 1 : {

                                 System.out.println("Ingrese la cantidad que desea retirar");
                                 double retiro = teclado.nextDouble();
                                 try {
                                     miCajero.retirar(retiro);
                                 } catch (SaldoInsuficienteException e){
                                     System.out.println("Error: " + e.getMessage());
                                 } catch (IllegalArgumentException e) {
                                     System.out.println("Error: " + e.getMessage());
                                 }
                             } break;
                             case 2: {
                                 System.out.println("Ingrese la cantidad que desea consignar");
                                 double consignacion = teclado.nextDouble();
                                 miCajero.consignar(consignacion);
                             } break;
                             case 3: {
                                 System.out.println("Aqui te mostramos tu saldo actual: " + miCajero.getSaldo());
                             } break;
                             case 4: {
                             } break;
                             default:{
                                 System.out.println("Dato Invalido");
                             }
                         }
                     } while (op != 4);

                 } break;
                 case 2:{
                     System.out.println("Aqui encontraras información de lo que puedes hacer en nuestro cajero");
                     System.out.println("-Aqui puedes realizar consignaciones a tu cuenta bancaria");
                     System.out.println("-Puedes realizar retiros en efectivo de tu cuenta bancaria");
                     System.out.println("-Puedes consultar el saldo de tu cuenta bancaria");
                 }break;
                 case 3:{
                     System.out.println("Gracias por usar el cajero");
                 }break;
                 default:{
                     System.out.println("Dato Invalido");
                 }
             }

        }while (op !=3);


    }
}