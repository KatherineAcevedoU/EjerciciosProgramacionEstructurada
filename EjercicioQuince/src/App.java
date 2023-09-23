import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
           Scanner entrada = new Scanner(System.in);

           double tarifaHora, salarioBruto, extras;
           String nombre = "";
           int horasTrabajadas;
           int repeticiones = 0;

           System.out.println("Calculo del salario bruto");
           

          do{

             System.out.println("Ingrese la cantidad de empleado");
             int cantidadEmpleado = entrada.nextInt();

              if(cantidadEmpleado >= 1){

                for(int i = 1; i <= cantidadEmpleado; i++){

                 System.out.println("Ingrese su nombre");
                 nombre = entrada.next();
                 System.out.println("Ingrese las horas trabajadas");
                 horasTrabajadas = entrada.nextInt();
                 System.out.println("Ingrese la tarifa por horas");
                 tarifaHora = entrada.nextDouble();

                  if(horasTrabajadas == 40){
            
                   salarioBruto = horasTrabajadas * tarifaHora;
                   System.out.println("Su nombre es: " + nombre);
                   System.out.println("Su salario bruto es de: " + salarioBruto);

                 
                  }else if(horasTrabajadas > 40){

                   salarioBruto = horasTrabajadas * tarifaHora;
                   extras = salarioBruto + (salarioBruto / 2);
                   System.out.println("Su nombre es: " + nombre);
                   System.out.println("Su salario es de: " + extras);

                  }else{
                   System.out.println("No ingreso correctamente las horas!");
                  }

                  System.out.println(":::::::::::::::::::::::::::::::::::::::");
                }

                repeticiones = 3;

              }else{
                System.out.println("No se puede ingresar numeros negativos.");

                repeticiones++;

                if(repeticiones == 3){
                 System.out.println("Error! se intento varias veces.");
                }

              }

          }while(repeticiones < 3);

            entrada.close();

    }
}
