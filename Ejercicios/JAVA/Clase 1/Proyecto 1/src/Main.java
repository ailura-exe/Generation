public class Main {
    public static void main(String[] args) {
        //ejercicio de enteros
        int numero1 = 5;
        int numero2 = 10;
        int suma = numero1 + numero2;

        System.out.println("La suma de los números es: " + suma);

        //definir tipo de dato decimal
        double radio;
        radio = 5.0;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El area del círculo es: " + area);

        //datos tipo caracter
        char caracter='b';
        System.out.println("La letra es: "+caracter);

        //definir dato booleano

        int num1=5;
        int num2=5;

        boolean iguales=(num2==num1);
        System.out.println("¿Son iguales? " + iguales);

        //definir un dato tipo string

        String cadena1="¡Hola ";
        String cadena2="mundo!;";
        String resultado= cadena1+cadena2;
        System.out.println(resultado);
    }
}


