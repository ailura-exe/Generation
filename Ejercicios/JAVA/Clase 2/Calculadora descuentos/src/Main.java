import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.println("ingrese el precio del producto: ");
        double precio=datos.nextDouble();
        System.out.println("Ingrese el descuento: ");
        double descuento= datos.nextDouble();

        double precioFinal= precio-(precio*(descuento/100));
        System.out.println("El precio con descuento es: "+precioFinal);
    }
}