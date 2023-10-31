//Es par o impar
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese el número: ");

        int numero= entrada.nextInt();

        if (numero%2==0){
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
    }
}