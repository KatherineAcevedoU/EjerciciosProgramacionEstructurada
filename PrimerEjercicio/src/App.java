import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int edad;
        char genero;
        char portaArmas;
        int repeticiones = 0;



      do{

           System.out.println("Ingrese porfavor su edad:");
           edad = entrada.nextInt();
           System.out.println("Ingrese porfavor su genero (f/m):");
           genero = entrada.next().charAt(0);


            if(edad >= 1){

                if(edad < 18){
                  System.out.println("Usted no puede entrar debido a su edad.");
 
                } else if(edad >= 18){
                   System.out.println("Puede entrar.");

                   System.out.println("¿Usted porta Armas (S-> si / N-> no)?");
                   portaArmas = entrada.next().charAt(0); 

                   switch(portaArmas){
                     case 's': System.out.println("Usted no puede entrar a la disco.");
                           break;

                     case 'n': System.out.println("Usted  puede entrar.");
                               System.out.println("Bienvenido a la discoteca.");
                           break;  
                  
                  
        
                      default:
                         System.out.println("No existe otra opcion");
                         break;
                   }

                   switch(genero){
                      case 'f': 
                           if(edad <= 20 ){
                             System.out.println("No puede consumir bebidas alcoholicas.");
                           } else if(edad > 20){
                             System.out.println("Usted tiene acceso a beber.");  
                           } 
                        break;
                
                      case 'm': 
                           if(edad <= 20){
                             System.out.println("No puede consumir bebidas alcoholicas.");
                           } else if(edad > 20){
                             System.out.println("Usted tiene acceso a beber.");  
                           }
                        break;

                      default:
                        System.out.println("No existe otra opcion.");
                   }



                }else{
                   System.out.println("Hubo un error!");
                }

                repeticiones = 3;

            }else{
                System.out.println("No se puede ingresar numero negativos.");
                
                repeticiones++;
                
               if(repeticiones == 3){
                 System.out.println("Error! se ha intentado varias veces.");
               }
            }
      
      }while(repeticiones < 3);
       

        
     entrada.close();
   }
}
