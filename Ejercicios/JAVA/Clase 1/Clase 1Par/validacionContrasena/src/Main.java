import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String claveInicial="clave_xd";

        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese la contraseña");

        String contrasena=entrada.nextLine();

        if (contrasena.equals(claveInicial)){
            System.out.println("Las contraseñas coinciden");
        }else{
            System.out.println("Contraseña incorrecta");
        }
        entrada.close();
    }
}