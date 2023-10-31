import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dato=new Scanner(System.in);
        System.out.println("Ingrese el número del día de la semana (1-5): ");
        int num=dato.nextInt();


        switch (num){
            case 1:
                System.out.println("Lunes");
                break;      //detiene el programa
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Ingrese un número entre 1 y 5");
        }

    }
}