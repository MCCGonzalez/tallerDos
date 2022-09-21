import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sensorSismológico {

    public static void main(String[] args){

        inicia();
    }

    private static void inicia(){


        int entrada = ingresar();
        double[][] sismo = crearMatriz(entrada);
        generarSismo(sismo);


    }

    private static int ingresar() {
        System.out.println("ingrese un valor");
        Scanner teclado = new Scanner(System.in);
        int entrada;

        do {
            try {
                entrada = teclado.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Por favor ingrese una opción válida:");
                teclado.nextLine();
            }
        } while (true);
        if (entrada == -0){
            salir();
        }
        return entrada;
    }
    private static void salir(){
        System.exit(0);

    }

    private static double[][] crearMatriz(int entrada){

        double[][] sismos = new double[entrada][24];
                return sismos;
    }
    private static void generarSismo(double[][] sismos){

        for (int i=0 ; i  < sismos.length ; i++){
            for (int j = 0; j < (sismos[i].length); j++){
                Random random = new Random();
                double sismo = 0.5 + (9.5 - 0.5) * random.nextDouble();
                sismo = Math.round(sismo * 100.0) / 100.0;
                sismos[i][j] = sismo;

            }
        }
        System.out.println(Arrays.deepToString(sismos));
        /*for (int i = 0; i < sismos.length; i ++){
            for (int j = 0; j < sismos[i].length; j++){
                System.out.println(sismos[i][j]);
            }
        }*/

    }

}
