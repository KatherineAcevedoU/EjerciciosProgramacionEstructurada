import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Kilometraje de automoviles");
        System.out.println("");

        int km_Conducido = 0, lts_Usados, cantidad_Reabastecimiento;
        int km_Por_lts, total_km_por_lts = 0;
        int repeticiones = 0;


        do{
            System.out.println("Ingrese la cantidad de reabastecimiento.");
            cantidad_Reabastecimiento = entrada.nextInt();
            

            if(cantidad_Reabastecimiento >= 1){

                for(int i = 0; i < cantidad_Reabastecimiento; i++){

                    System.out.println("Ingrese los kilometros conducidos por viaje: ");
                    km_Conducido = entrada.nextInt();
                    System.out.println("Ingrese los litros usados por viaje: ");
                    lts_Usados = entrada.nextInt();

                    km_Por_lts = km_Conducido / lts_Usados;

                    System.out.println("La cantidad de km por lts en el viaje es:  " + km_Por_lts);
                    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                   
                    total_km_por_lts+=km_Por_lts;
                }
               
                    System.out.println("El total de kilometros por litros de todos los viajes es: " + total_km_por_lts);

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
