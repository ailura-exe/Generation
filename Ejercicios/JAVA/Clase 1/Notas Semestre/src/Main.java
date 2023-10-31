import java.util.Scanner;

public class Main {
    public static void main(String[] args) {tgg
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la nota: ");
        double nota=entrada.nextDouble();

        if (nota >= 3.0){
            System.out.println("Pasó el semestre");
        }else {
            System.out.println("No pasó el semestre");
        }
    }

}