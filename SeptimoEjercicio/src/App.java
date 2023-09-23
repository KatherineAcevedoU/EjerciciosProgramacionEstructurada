import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String numeroDeCuenta;
        char codigoDeServicio;
        int cantidadDeMinutos;
        double exceso, pago, total;
        int repeticiones = 0;
        

       System.out.println("Compañia de telefonia celular.");
       System.out.println("");
       System.out.println("Ingrese su numero de cuenta: ");
       numeroDeCuenta = entrada.nextLine();
       System.out.println("Ingrese su codigo de servicio (R-> regular y P-> premium): ");
       codigoDeServicio =entrada.next().charAt(0);
    
       double dolar = 36.50;
    

     do{

         System.out.println("Ingrese la cantidad de minutos utilizados:");
         cantidadDeMinutos = entrada.nextInt();


         if(cantidadDeMinutos > 0){

          switch(codigoDeServicio){
         
            case 'R':
            case 'r': System.out.println("Bienvenido al servicio regular.");
                      
                    if(cantidadDeMinutos >= 1  && cantidadDeMinutos <= 50){

                         pago = 10 * dolar;

                        System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
                        System.out.println("Factura");
                        System.out.println("");
                        System.out.println("Numero de cuenta: " +numeroDeCuenta);
                        System.out.println("Tipo de servicio: Regular.");
                        System.out.println("Cantidad de minutos utilizados: " +cantidadDeMinutos);
                        System.out.println("Usted pagara: " +pago);

                    }else if(cantidadDeMinutos > 50){

                       exceso = cantidadDeMinutos * (dolar * 0.20); 
                       pago =  10 * 36.50;
                       total = exceso + pago; 

                        System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
                        System.out.println("Factura");
                        System.out.println("");
                        System.out.println("Numero de cuenta: " +numeroDeCuenta);
                        System.out.println("Tipo de servicio: Regular.");
                        System.out.println("Cantidad de minutos utilizados: " +cantidadDeMinutos);
                        System.out.println("Usted debera pagar: " +total);
                    }
                break;

            case 'P':
            case 'p': System.out.println("Bienvenido al servicio premium.");

                      System.out.println("Ingrese el numero de minutos d) Dia y n) Noche)");
                      char numeroDeMinutos = entrada.next().charAt(0);

                      switch(numeroDeMinutos){

                        case 'D':
                        case 'd': 

                                 if(cantidadDeMinutos >= 1 && cantidadDeMinutos <= 75){

                                    pago = 25 * dolar;

                                    System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
                                    System.out.println("Factura");
                                    System.out.println("");
                                    System.out.println("Numero de cuenta: " +numeroDeCuenta);
                                    System.out.println("Tipo de servicio: Premium.");
                                    System.out.println("Cantidad de minutos utilizados: " +cantidadDeMinutos);
                                    System.out.println("Usted pagara: " +pago);

                                 }else if(cantidadDeMinutos > 75){

                                      exceso = cantidadDeMinutos * (0.10 * dolar);
                                      pago =  25 * 36.50;
                                      total = exceso + pago; 

                                      System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
                                      System.out.println("Factura");
                                      System.out.println("");
                                      System.out.println("Numero de cuenta: " +numeroDeCuenta);
                                      System.out.println("Tipo de servicio: Premium.");
                                      System.out.println("Cantidad de minutos utilizados: " +cantidadDeMinutos);
                                      System.out.println("Usted pagara: " +total);

                                 }
                                break;
                                
                        case 'N':
                        case 'n':

                                 if(cantidadDeMinutos >= 1 && cantidadDeMinutos <= 100){

                                    pago = 25 * dolar;

                                    System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
                                    System.out.println("Factura");
                                    System.out.println("");
                                    System.out.println("Numero de cuenta: " +numeroDeCuenta);
                                    System.out.println("Tipo de servicio: Premium.");
                                    System.out.println("Cantidad de minutos utilizados: " +cantidadDeMinutos);
                                    System.out.println("Usted pagara: " +pago);

                                 }else if(cantidadDeMinutos > 100){

                                     exceso = cantidadDeMinutos * (0.05 * dolar);
                                     pago =  25 * 36.50;
                                     total = exceso + pago; 

                                      System.out.println(":::::::::::::::::::::::::::::::::::::::::::");
                                      System.out.println("Factura");
                                      System.out.println("");
                                      System.out.println("Numero de cuenta: " +numeroDeCuenta);
                                      System.out.println("Tipo de servicio: Premium.");
                                      System.out.println("Cantidad de minutos utilizados: " +cantidadDeMinutos);
                                      System.out.println("Usted pagara: " +total);
                                 }
            

                              break;  
                              
                        default:
                            System.out.println("Error! no existe.");

                      }
                      


                break;


            default:
                System.out.println("Su codigo de servicio no existe.");

          }

            repeticiones = 3;

        }else{
         
             System.out.println("No se puede ingresar numeros negativos.");
             System.out.println("");

             repeticiones++;

            if(repeticiones == 3){
              System.out.println("Error! se intento varias veces.");
            }
        }

     }while(repeticiones < 3);

        entrada.close();
    }
}
