import java.util.Scanner;

public class sensorSismológico {

    public static void main(String[] args){

        inicia();
    }

    private static void inicia(){

        int entrada = ingresar();
        crearMatriz(entrada);


    }
    private static int ingresar() {
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

    private static String[][] crearMatriz(int entrada){

        String[][] sismos = new String[entrada][23];
                return sismos;
    }
    private static String[][] generarSismo(String[][] sismos){

        return sismos;
    }
}
