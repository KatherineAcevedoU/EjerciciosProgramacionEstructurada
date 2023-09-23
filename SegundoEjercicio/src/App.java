import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);

        double longitud1, longitud2, longitud3;
        double triangulo;

        int repeticiones = 0;
 
        do{
            
             System.out.println("Ingrese las longitudes del triangulo.");
             System.out.println("");
             System.out.println("Primer lado: ");
             longitud1 = entrada.nextDouble();
             System.out.println("Segundo lado: ");
             longitud2 = entrada.nextDouble();
             System.out.println("Tercer lado: ");
             longitud3 = entrada.nextDouble();

            
            triangulo = longitud1 + longitud2;

            if(triangulo >= longitud3){
               System.out.println("Si se puede forma un triangulo.");
               System.out.println("");

                if (longitud3 == Math.pow(longitud1, 2) + Math.pow(longitud2, 2)){
                      System.out.println("Este es un triangulo rectangulo.");

                }else if((longitud1 == longitud2) && (longitud2 == longitud3)){
                      System.out.println("Este es un triangulo Equilatero.");

                }else if((longitud1 == longitud2) && (longitud2 != longitud3) || (longitud2 == longitud3) && (longitud3 != longitud1) || (longitud1 == longitud3) && (longitud3 != longitud2)){
                      System.out.println("Este es un triangulo Isosceles.");

                }else if((longitud1 != longitud2) && (longitud1 != longitud3) && (longitud2 != longitud1) && (longitud2 != longitud3) && (longitud3 != longitud1) && (longitud3 != longitud2)){
                      System.out.println("Este es un triangulo Escaleno.");

                }
                

                repeticiones = 3;

            }else {
               System.out.println("No se pudo formar el triangulo");

               repeticiones++;

               if(repeticiones == 3){
                  System.out.println("Error! se intento varias veces.");
               }
            }
         
        
        }while(repeticiones < 3);

          entrada.close();
    
    }

}
   
  
