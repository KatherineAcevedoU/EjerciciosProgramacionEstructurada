import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        char genero;
        int kilogramos;
        double altura, pesoCorporal;
        double A1, A2, A3, A4, A5, B, grasaCorporal, porcentaje_Grasa_Corporal;
        double medidaMuñeca, medidaCintura, medidaCadera, medidaAntebrazo;
        int repeticiones = 0;

        System.out.println("Calculo de grasa corporal.");
        System.out.println("");
        
        do{

           System.out.println("Ingrese los kilogramos.");
           kilogramos = entrada.nextInt();
           System.out.println("Ingrese su altura.");
           altura = entrada.nextDouble();


            if(kilogramos > 0 && altura > 0){

                pesoCorporal = kilogramos / (altura*altura);
                System.out.println("Su peso corporal es: " +pesoCorporal);

                System.out.print("Ingrese su genero (f-> Femenino y m-> Masculino): ");
                genero = entrada.next().charAt(0);


                switch(genero){
                    case 'f':
                             System.out.println("Ingrese las medidas");
                             System.out.println("");
                             System.out.println("Medida de su muñeca (Punto mas amplio).");
                             medidaMuñeca = entrada.nextDouble();
                             System.out.println("Medida de su cintura (Ombligo).");
                             medidaCintura = entrada.nextDouble();
                             System.out.println("Medida de su cadera (Punto mas amplio).");
                             medidaCadera = entrada.nextDouble();
                             System.out.println("Medida de su antebrazo (Punto mas amplio).");
                             medidaAntebrazo = entrada.nextDouble();

                             A1 = (pesoCorporal*0.732)+8.987;
                             A2 = medidaMuñeca/ 3.140;
                             A3 = medidaCintura*0.157;
                             A4 = medidaCadera*0.249;
                             A5 = medidaAntebrazo*0.434;
                             B = A1+A2-A3-A4+A5;

                             grasaCorporal = pesoCorporal - B;
                             porcentaje_Grasa_Corporal = (grasaCorporal * 100) / pesoCorporal;

                             System.out.println("El porcentaje de grasa corporal es de: " + porcentaje_Grasa_Corporal);

                        break;

                   case 'm':
                            System.out.println("Ingrese las medidas");
                            System.out.println("");
                            System.out.println("Medida de su cintura.");
                            medidaCintura = entrada.nextDouble();

                            A1 = (pesoCorporal*1.082)+94.42;
                            A2 = medidaCintura*4.15;
                            B = A1 -A2;

                             grasaCorporal = pesoCorporal - B;
                             porcentaje_Grasa_Corporal = (grasaCorporal * 100) / pesoCorporal;
                    
                            System.out.println("El porcentaje de grasa corporal es de: " + porcentaje_Grasa_Corporal);
                        break;


                     default:
                           System.out.println("No se existe el genero.");

                    repeticiones = 3;

                }

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
