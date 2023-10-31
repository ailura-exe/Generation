import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el año: ");
        int year=entrada.nextInt();

        if ((year%4==0 && year%100!=0)||(year%400==0)){
            System.out.println(year+" es bisiesto.");
        }else {
            System.out.println(year+" no es bisiesto.");
        }
    }
}