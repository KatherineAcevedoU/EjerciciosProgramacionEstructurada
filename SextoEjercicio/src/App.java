import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int clientes = 1;
        int cantidadClientes, numeroDeCuenta;
        char tipoDeCuenta;
        double saldoMinimo, saldoActual, saldoNuevo;
        int repeticiones = 0;

        System.out.println("Actualizacion de las cuentas");
        System.out.println("");
       
     do{

        System.out.println("Ingrese la cantidad de clientes.");
        cantidadClientes = entrada.nextInt();


          if(cantidadClientes > 0){
        
            do{

               System.out.println("Ingrese su numero de cuenta:");
               numeroDeCuenta = entrada.nextInt();
               System.out.println("Ingrese el tipo de cuenta (S-> ahorros o C-> cheques)");
               tipoDeCuenta = entrada.next().charAt(0);

                switch(tipoDeCuenta){

                  case 'S':
                  case 's': System.out.println("Ingrese su saldo minimo: ");
                            saldoMinimo = entrada.nextInt();
                            System.out.println("Ingrese su saldo actual: ");
                            saldoActual = entrada.nextInt();

                           if(saldoActual < saldoMinimo){
                              
                            
                            saldoNuevo = saldoActual + 10;

                            System.out.println("");
                            System.out.println("Su numero de cuenta es: " +numeroDeCuenta);
                            System.out.println("El tipo de cuenta es: " +tipoDeCuenta);
                            System.out.println("El saldo actual es: " +saldoActual);
                            System.out.println("Su saldo nuevo es: " +saldoNuevo + " U$");
                             

                           }else if(saldoActual > saldoMinimo){
                            
                           
                            saldoNuevo = (saldoActual * 4) / 100;

                            System.out.println("");
                            System.out.println("Su numero de cuenta es: " +numeroDeCuenta);
                            System.out.println("El tipo de cuenta es: " +tipoDeCuenta);
                            System.out.println("El saldo actual es: " +saldoActual);
                            System.out.println("Su saldo nuevo es: " +saldoNuevo + " U$");

                           }

                      break;

                  case 'C':
                  case 'c': System.out.println("Ingrese su saldo minimo: ");
                            saldoMinimo = entrada.nextInt();
                            System.out.println("Ingrese su saldo actual: ");
                            saldoActual = entrada.nextInt();

                            if(saldoActual < saldoMinimo){
                              
                            
                            saldoNuevo = saldoActual + 25;

                            System.out.println("");
                            System.out.println("Su numero de cuenta es: " +numeroDeCuenta);
                            System.out.println("El tipo de cuenta es: " +tipoDeCuenta);
                            System.out.println("El saldo actual es: " +saldoActual);
                            System.out.println("Su saldo nuevo es: " +saldoNuevo + " U$");

                   
                            }else if(saldoActual > saldoMinimo){
                                
                               
                               saldoNuevo = (saldoActual * 5) / 100;
                               System.out.println("");
                               System.out.println("Su numero de cuenta es: " +numeroDeCuenta);
                               System.out.println("El tipo de cuenta es: " +tipoDeCuenta);
                               System.out.println("El saldo actual es: " +saldoActual);
                               System.out.println("Su saldo nuevo es: " +saldoNuevo + " U$");
                            }
                      break;

                  default:
                    System.out.println("No existe el tipo de cuenta.");

                }

                System.out.println(":::::::::::::::::::::::::::::::::");
                clientes++;


            }while(clientes <= cantidadClientes);

             repeticiones = 3;
         
         }else{
            System.out.println("No se puede ingresar numeros negativos");
            System.out.println("");

            repeticiones++;

            if(repeticiones == 3){
              System.out.println("Error! se intento varias veces");
            }

         }
       
      }while(repeticiones < 3);  
         
    
      entrada.close();
        
    }
}
