import java.util.Scanner;

//una función que permita calcular el área del rectángulo
public class Main {

    //se inicializa la función

    public static double calcularAreaRectangulo(double longitud, double ancho){
        return longitud* ancho;
    }

    //Función para verificar si un número es + o -
    public static String verificarSigno(int numero){
        if (numero>0){
            return "Positivo";
        } else if (numero < 0) {
            return  "Negativo";
        }else{
            return "nulo";
        }
    }

    public static double calcularPotencia(double base, int exponente){
        double resultado=1.0;
        for (int i=0; i<exponente; i++){
            resultado*=base;
        }
        return resultado;
    }

    //una función que perrmita obtener el valor máximo de tres números enteros
    public static int valorMaximo(int num1, int num2,  int num3){
         int maxim=Math.max(num1,Math.max(num2,num3));
         return maxim;
    }

    //calcular el factorial de un número
    public static int factorial(int numero){
        if (numero==0 || numero==1){
            return 1;
        } else{
            return numero*factorial(numero-1);
        }
    }


    public static void main(String[] args) {
        //invocar todos los métodos inicializados antes
        //metodo 1
        double area=calcularAreaRectangulo(5.3, 5.7);
        System.out.println("El area del rectangulo es: "+area);

        //metodo 2
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese el número: ");
        int number= sc.nextInt();
        String resultadoSigno=verificarSigno(number);
        System.out.println("El número " +number+"es "+resultadoSigno);

        //metodo 3
        System.out.print("Ingrese la base: ");
        int base= sc.nextInt();
        System.out.print("Ingrese el exponente: ");
        int exponente= sc.nextInt();
        double potencia=calcularPotencia(base, exponente);
        System.out.println(base + " elevado a la " + exponente+ " es igual a "+potencia);

        //metodo 4
        System.out.print("Ingrese primer número: ");
        int n1= sc.nextInt();
        System.out.print("Ingrese segundo número: ");
        int n2= sc.nextInt();
        System.out.print("Ingrese tercer número: ");
        int n3= sc.nextInt();

        int maximo=valorMaximo(n1,n2,n3);
        System.out.println("El número más alto es: "+maximo);
    }
}