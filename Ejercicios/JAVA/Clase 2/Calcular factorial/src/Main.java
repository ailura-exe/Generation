import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numero=5;
        long factorial=calcularFactorial(numero);
    }
    public static long calcularFactorial(int n){
        if (n <= 1) {
            return 1;

        }
        return n*calcularFactorial(n-1);
    }
}