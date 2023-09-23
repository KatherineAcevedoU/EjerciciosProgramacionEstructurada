import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int valorA, valorB, valorC;
        int repeticiones = 0;
        double discriminante, formula;
        double respuesta1, respuesta2;

      
      do{

        System.out.println("Ingrese los valores de la ecuacion ax^2+bx+c.");
        System.out.println("");
        System.out.println("Ingrese el coeficiente de X^2.");
        valorA = entrada.nextInt();
        System.out.println("Ingrese el coeficiente de X");
        valorB = entrada.nextInt();
        System.out.println("Ingrese el termino constante.");
        valorC = entrada.nextInt();

          if(valorA != 0){

            discriminante = Math.sqrt((Math.pow(valorB, 2)) - (4 * valorA * valorC));


              if(discriminante == 0){
               formula = (-(valorB) ) / (2 * valorA);

               System.out.println("La ecuacion tiene una solucion repetida.");
               System.out.println("El resultado de la ecuacion es: " +formula);

              }else if(discriminante > 0){
               respuesta1 = (-(valorB) + discriminante) / (2 * valorA);
               respuesta2 = (-(valorB) - discriminante) / (2 * valorA);               

               System.out.println("La ecuacion tiene dos soluciones reales.");
               System.out.println("El primer resultado de la ecuacion es: " +respuesta1);
               System.out.println("El segundo resultado de la ecuacion es: " +respuesta2);
               

              }else if(discriminante < 0){
               formula = -(valorB) / (2 * valorA);

               System.out.println("La ecuacion no tiene solucion!.");

              }else{
                System.out.println("No se pudo calcular el dicriminante.");
              }
            
            repeticiones = 3;
            
          }else {
            System.out.println("No se puede ingresar numeros negativos.");
            System.out.println("");
            
            repeticiones++;

            if(repeticiones == 3 ){
              System.out.println("Error! se intento varias veces.");
            }
          }

      }while(repeticiones < 3);

        entrada.close();
        
    }
}
