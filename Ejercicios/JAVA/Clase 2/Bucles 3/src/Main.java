import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Programa que genere un numero aleatorio y pida al usuario adivinarlo
        Scanner sc=new Scanner(System.in);

        Random random=new Random();

        int numeroAleatorio=random.nextInt(10)+1;

        int veces=0;
        int intento;

        System.out.println("Adivina el numero entre 1 y 10");
        do{
            System.out.println("Ingresa el valor: ");
            
            intento=sc.nextInt();
            veces++;
            
            if(intento<numeroAleatorio){
                System.out.println("Muy bajo, intenta de nuevo");
            }else if (intento>numeroAleatorio) {
                System.out.println("Muy alto, intenta de nuevo");
            }else {
                System.out.println("Has adivinado el numero ♥");
                System.out.println("Numero de intentos: "+veces);
            }

        }while (intento!=numeroAleatorio);
    }
}