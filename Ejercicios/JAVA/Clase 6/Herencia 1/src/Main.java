public class Main {
    public static void main(String[] args) {

        Rectangulo rectangulo1=new Rectangulo(4.6, 7.8);
        Triangulo triangulo1=new Triangulo(6.9,5.2);


        System.out.println("El área del rectángulo es: "+rectangulo1.calcularArea());
        System.out.println("El área del triángulo es: "+triangulo1.calcularArea());

    }
}