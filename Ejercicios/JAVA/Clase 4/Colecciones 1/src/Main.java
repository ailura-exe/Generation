import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //crear una lista de números y luego sumarla

        List<Integer>numeros=new ArrayList<>();     //lista de números enteros

        numeros.add(13);
        numeros.add(23);    //agregar datos a la lista
        numeros.add(15);
        numeros.add(1);

        int suma=0;
        for (int numero: numeros){      //Calcular la suma de los numeros
            suma+=numero;
        }
        System.out.println("La suma de los números en la lista es: "+suma);
    }
}