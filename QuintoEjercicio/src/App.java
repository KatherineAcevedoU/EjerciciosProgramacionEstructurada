import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    
       Scanner entrada = new Scanner(System.in);
      
       int numero, repeticiones = 0;
       int digitos, suma = 0;
       
        do{
            System.out.println("Ingrese el numero.");
            numero = entrada.nextInt();

            if(numero > 0){

                while(numero > 0){
                 digitos = numero % 10;
                 System.out.println(digitos + "");
                  
                 numero = numero / 10;
                 suma += digitos;
                }
                
                System.out.println("La suma de los digitos es : " +suma);
                
                repeticiones = 3;

            }else{
                
                System.out.println("No se puede ingresar numeros negativos.");
                System.out.println("");
                
                repeticiones++;
                
                if(repeticiones == 3){
                    System.out.println("Error! Se intento varias veces.");
                }
            }
        
        }while(repeticiones < 3);     

            entrada.close();
    }
}
