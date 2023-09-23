import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System .in);

        int numeroCuenta, saldo_Inicio_Mes, total_Artic_Cargados, total_Cred_Aplicado, limite_Credi_Permitido;
        int cantidadCliente;
        int  nuevoSaldo, cliente = 1, repeticiones = 0;

        System.out.println("Tienda de articulos electrodomesticos.");
        System.out.println("");
        
      do{

        System.out.println("Cantidad de clientes: ");
        cantidadCliente = entrada.nextInt();

          if(cantidadCliente >= 1){
           
            do{

              System.out.println("Ingrese el numero de su cuenta: ");
              numeroCuenta = entrada.nextInt();
              System.out.println("Ingrese el saldo al inicio del mes: ");
              saldo_Inicio_Mes = entrada.nextInt();
              System.out.println("Ingrese el total de los articulos cargados: ");
              total_Artic_Cargados = entrada.nextInt();
              System.out.println("Ingrese el total de los creditos aplicados: ");
              total_Cred_Aplicado = entrada.nextInt();
              System.out.println("Ingrese el limite de credito permitido: ");
              limite_Credi_Permitido = entrada.nextInt();

              nuevoSaldo = (saldo_Inicio_Mes + total_Artic_Cargados) - total_Cred_Aplicado;

              System.out.println("");
              System.out.println("numero de cuenta: " +numeroCuenta);
              System.out.println("Su nuevo saldo es: " +nuevoSaldo);

              if(nuevoSaldo > limite_Credi_Permitido){

                System.out.println("Se excedio el limite de su credito.");
              }

              System.out.println(":::::::::::::::::::::::::::::::::::::");
              cliente++;
        
           }while(cliente <= cantidadCliente);

           repeticiones = 3;

          }else{
            System.out.println("No se puede ingresar numero negativos.");
             
            repeticiones++;

            if(repeticiones == 3){
              System.out.println("Error! se intento varias veces.");
            }

          }

      }while(repeticiones < 3);

        entrada.close();
    }
}
