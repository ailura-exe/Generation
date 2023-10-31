public class Main {

    public static boolean esPar(int numero){
        return numero%2==0;
    }


    public static void main(String[] args) {

        int numero=6;
        if (esPar(numero)){
            System.out.println(numero+" es par");
        }else {
            System.out.println(numero+" no es par");
        }
    }
}