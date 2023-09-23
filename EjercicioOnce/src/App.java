import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int montoPrestamo;
        double tasa_Interes_Anual, pagoMensual;
        double tasaMensual, interesMes, pagoAbonado;
        int repeticiones = 0;

        System.out.println("Pago periodico");
        System.out.println("");
        
        do{

           System.out.println("Ingrese el monto del prestamo: ");
           montoPrestamo = entrada.nextInt();
           System.out.println("Ingrese la tasa de interes anual: ");
           tasa_Interes_Anual = entrada.nextDouble();
           System.out.println("Ingrese el pago mensual: ");
           pagoMensual = entrada.nextDouble();

            if(montoPrestamo > 0 && tasa_Interes_Anual > 0 && pagoMensual > 0){
  
               for(int i= 1; i <= 12; i++){

                   tasaMensual = tasa_Interes_Anual / 12;
                   System.out.println("Su tasa mensual es: " +tasaMensual);
        
                   interesMes = (montoPrestamo * tasaMensual) / 100;
                   System.out.println("el interes del mes: " +interesMes);

                   pagoAbonado = pagoMensual - interesMes;
                   System.out.println("El pago abonado es: " +pagoAbonado);

                   montoPrestamo -= pagoAbonado;
                   System.out.println("El nuevo prestamo es: " +montoPrestamo);

              
                   System.out.println("::::::::::::::::::::::::::::::");
                   
                   if(pagoMensual < tasaMensual){
                      System.out.println("El pago mensual es demasiado bajo.");
                   }
                   
                   repeticiones = 3;
                }
           
            
            }else{
               System.out.println("No se puede ingresar numero negativos.");
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
