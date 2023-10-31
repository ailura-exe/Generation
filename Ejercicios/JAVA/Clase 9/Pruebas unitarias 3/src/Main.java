public class Main {


    public static void main(String[] args) {
        double base=5.4;
        double altura=8.3;

        double area=Area.calcularArea(base,altura);

        System.out.println("El área del tríangulo con base "+base+" y altura "+altura+ "es: "+area);
    }
}