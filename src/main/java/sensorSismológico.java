import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sensorSismológico {

    public static void main(String[] args){

        inicia();
    }

    private static void inicia(){


        int entrada = ingresar();
        double[][] sismos = crearMatriz(entrada);
        generarSismo(sismos);
        //System.out.println(Arrays.deepToString(sismos));
        sismoMasIntenso(sismos);
        sismosMayoresIgualesA55(sismos);
        alertaEscaladaSismica(sismos);

    }

    private static int ingresar() {
        System.out.println("cantidad de dias a medir");
        System.out.println("para salir ingrese -0");
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

        for (int i = 0 ; i  < sismos.length ; i++){
            for (int j = 0; j < (sismos[i].length); j++){
                Random random = new Random();
                double sismo = 0.5 + (9.5 - 0.5) * random.nextDouble();
                sismo = Math.round(sismo * 100.0) / 100.0;
                sismos[i][j] = sismo;

            }
        }
        imprimirSismos(sismos);
    }
    private static void imprimirSismos(double[][] sismos){

        for (int i = 0; i < sismos.length; i++) {
            System.out.println(Arrays.toString(sismos[i]));
        }

    }
    private static void sismoMasIntenso(double[][] sismos) {
        double mayorSismo = sismos[0][0];
        int dia = 0;
        int hora = 0;
        for (int i = 0; i < sismos.length; i++) {
            for (int j = 0; j < sismos[i].length; j++) {
                if (sismos[i][j] > mayorSismo) {
                    mayorSismo = sismos[i][j];
                    dia = (i + 1);
                    hora = j;
                }
            }
        }
        System.out.println("sismo de mayor intensidad:  "+ mayorSismo + " en el dia "+ dia +" a las "+ hora + " horas");
    }
    private static void sismosMayoresIgualesA55(double[][] sismos){
        int contador = 0;
        for (int  i = 0; i < sismos.length; i++){
            for (int j = 0; j < sismos[i].length; j++){
                if (sismos[i][j] >= 5.5){
                    contador ++;
                }
            }
        }
        System.out.println("Sismos mayores a 5.5 = " + contador);

    }
    private static void alertaEscaladaSismica(double[][] sismos){

        double valor = 6;
        int contador = 0;
        int dias = 0;

        for (int i = 0; i < sismos.length; i++){
            for (int j = 0;  j < sismos[i].length; j++){
                if(valor <= sismos[i][j]){

                    contador ++;

                }
                if(contador >= 4){

                    dias ++;
                    System.out.println("enjambre sismologico ");
                    break;

                }
            }
        }
        System.out.println("numero de dias enjambre " +dias);

    }
    private static void hayEnjambreSismico(double[][] sismos){


    }


}
