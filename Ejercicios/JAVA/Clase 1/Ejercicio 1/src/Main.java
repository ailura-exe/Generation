import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //programa para comparar numeros

        Scanner sc=new Scanner((System.in));  //aquí activamos la solicitud de los datos por consola

        System.out.println("Ingrese el primer número: ");

        int num1=sc.nextInt();

        System.out.println("Ingrese el segundo número: ");

        int num2= sc.nextInt();     //sc es el nomnre que almacena los datos y .nextInt es como el ParseInt en js

        if (num1==num2){
            System.out.println("Los números son iguales");
        }else {
            System.out.println("Los numeros son diferentes");
        }
    }
}