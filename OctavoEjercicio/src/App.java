import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);

       double longitud, ancho;
       char tipoDeMarco, corona;
       String color;
       double costoMarco, costoCarton, costoVidrio, costoCorona, costoPintado,costoTotal;
       int repeticiones = 0;

       System.out.println("Tienda de enmarcado de fotografia");
       System.out.println("");
 
       double pintado = 0.10;
       double marcoRegular = 0.15;
       double marcoLujoso = 0.25;
       double carton = 0.02;
       double vidrio = 0.07;
       double unaCorona = 0.35;
       double dolar = 36.50;
       

       do{

            System.out.println("Ingrese la longitud en pulgadas: ");
            longitud = entrada.nextDouble();
            System.out.println("Ingrese el ancho en pulgadas: ");
            ancho = entrada.nextDouble();

            double areaFotografia = longitud * ancho;
       
         
            if(longitud > 0 && ancho > 0){

               System.out.println("Ingrese el color que desee: ");
               color = entrada.next();
               System.out.println("Ingrese el tipo de marco (r-> regular o l->lujoso) ");
               tipoDeMarco = entrada.next().charAt(0);

               switch(tipoDeMarco){

                     case 'R':
                     case 'r': costoPintado = (pintado * dolar) * areaFotografia; 
                               costoMarco = (marcoRegular * dolar)* areaFotografia;
                               costoCarton = (carton * dolar)* areaFotografia;
                               costoVidrio = (vidrio * dolar) * areaFotografia;

                               System.out.println("Desea agregarles corona (S-> si o N -> no)");
                               corona = entrada.next().charAt(0);
                         
                                 switch(corona){

                                    case 'S':
                                    case 's':
                                          costoCorona =  (unaCorona * dolar) * 4;

                                          costoTotal = costoPintado + costoMarco + costoCarton + costoVidrio + costoCorona;

                                          System.out.println("El color del enmarcado es: "+color);
                                       
                                          System.out.println("El costo total de enmarcar la fotografia es: " +costoTotal);

                                    break;

                                    case 'N':
                                    case 'n': 
                                          costoTotal = costoPintado + costoMarco + costoCarton + costoVidrio;

                                           System.out.println("El color del enmarcado es: "+color);
                                       
                                           System.out.println("El costo total de enmarcar la fotografia es: " +costoTotal);

                                    break;

                                    default:
                                      System.out.println("No existe esta opcion");

                                 }

                     break;

                     case 'L':
                     case 'l': costoPintado = (pintado * dolar) * areaFotografia; 
                               costoMarco = (marcoLujoso * dolar)* areaFotografia;
                               costoCarton = (carton * dolar) * areaFotografia;
                               costoVidrio = (vidrio * dolar) * areaFotografia;

                               System.out.println("Desea agregarles corona (S-> si o N -> no)");
                               corona = entrada.next().charAt(0);
                         
                                 switch(corona){

                                    case 'S':
                                    case 's':
                                          costoCorona =  (unaCorona * dolar) * 4;

                                          costoTotal = costoPintado + costoMarco + costoCarton + costoVidrio + costoCorona;

                                          System.out.println("El color del enmarcado es: "+color);
                                       
                                          System.out.println("El costo total de enmarcar la fotografia es: " +costoTotal);

                                    break;

                                    case 'N':
                                    case 'n': 
                                          costoTotal = costoPintado + costoMarco + costoCarton + costoVidrio;

                                          System.out.println("El color del enmarcado es: "+color);
                                       
                                          System.out.println("El costo total de enmarcar la fotografia es: " +costoTotal);         

                                    break;

                                    default:
                                      System.out.println("No existe esta opcion");

                                 }

                     break;

                     default:
                     System.out.println("No existe el tipo de marco.");


               }    

               repeticiones = 3;
     
            }else{

               System.out.println("No puede ingresar numeros negativos.");
               
               repeticiones++;

               if(repeticiones == 3){
                 System.out.println("Error! se intento varias veces");
               }
          

            }
    
        } while(repeticiones < 3);

          entrada.close();
 
      }                                   

}
