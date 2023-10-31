import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Verificar si un elemento existe dentro de un arreglo de numero primos

        int[] arreglo= {2,3,5,7,11,13};

        Scanner buscar=new Scanner(System.in);
        System.out.println("Ingrese el numero a buscar: ");
        int elemento=buscar.nextInt();
        boolean encontrado=false;

        for (int i=0; i<arreglo.length; i++){
            if (elemento==arreglo[i]){
                encontrado=true;
                break;
            }
        }
        if (encontrado==true){
            System.out.println("El numero existe en el arreglo");
        } else {
            System.out.println("EL número no existe en el arreglo");
        }
    }
}