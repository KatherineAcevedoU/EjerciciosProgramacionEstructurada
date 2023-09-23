import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Comisiones por semana.");
        System.out.println("");

        int cantidad_ArticVendidos;
        double totalVendido, ingresosDelVendedor;
        int repeticiones = 0;

        double articulo1 = 239.99;
        double articulo2 = 129.75;
        double articulo3 = 99.95;
        double articulo4 = 350.89;
        do{
             System.out.println("Ingrese la cantidad de articulos vendido: ");
             int cantidadVendida = entrada.nextInt();
             System.out.println("");
        
            if(cantidadVendida >= 1){
          
                for(int i = 0; i < cantidadVendida; i++){

                  System.out.println("Tipo de articulo vendido.");
                  System.out.println(".....................");
                  System.out.println("Menu");
                  System.out.println("Articulo  ->  Vendido");
                  System.out.println("   1      ->   239.99");
                  System.out.println("   2      ->   129.75");
                  System.out.println("   3      ->   99.95");
                  System.out.println("   4      ->   350.89");
                  System.out.println("......................");
                  System.out.println("");
                  System.out.println("Elija el numero de articulo vendido");
                  int opcion = entrada.nextInt();


                    switch (opcion) {
                        case 1: System.out.println("Ingrese la cantidad de articulo vendido: ");
                               cantidad_ArticVendidos = entrada.nextInt();

                               totalVendido = articulo1  * cantidad_ArticVendidos;

                               ingresosDelVendedor = (totalVendido * 9) / 100 + 200;

                               System.out.println("Total vendido es: " + totalVendido);
                               System.out.println("Total ingresos son: " + ingresosDelVendedor); 

                    
                        break;

                        case 2: System.out.println("Ingrese la cantidad de articulo vendido: ");
                                cantidad_ArticVendidos = entrada.nextInt();

                                totalVendido = articulo2  * cantidad_ArticVendidos;

                                ingresosDelVendedor = (totalVendido * 9) / 100 + 200;

                                System.out.println("Total vendido es: " + totalVendido);
                                System.out.println("Total ingresos son: " + ingresosDelVendedor); 

                        break;

                        case 3: System.out.println("Ingrese la cantidad de articulo vendido: ");
                                cantidad_ArticVendidos = entrada.nextInt();

                                totalVendido = articulo3  * cantidad_ArticVendidos;

                                ingresosDelVendedor = (totalVendido * 9) / 100 + 200;

                                System.out.println("Total vendido es: " + totalVendido);
                                System.out.println("Total ingresos son: " + ingresosDelVendedor); 


                        break;

                        case 4: System.out.println("Ingrese la cantidad de articulo vendido: ");
                                cantidad_ArticVendidos = entrada.nextInt();

                                totalVendido = articulo4  * cantidad_ArticVendidos;

                                ingresosDelVendedor = (totalVendido * 9) / 100 + 200;

                                System.out.println("Total vendido es: " + totalVendido);
                                System.out.println("Total ingresos son: " + ingresosDelVendedor); 


                        break;
             
                        default: System.out.println("No existe la opcion.");
                        break;
                    }

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
