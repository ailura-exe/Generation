public class Main {
    public static void main(String[] args) {

        Coche coche1=new Coche("Mazda 3");

        coche1.encenderMotor();
        coche1.acelerarCoche(50);
        coche1.frenarCoche(20);
        coche1.acelerarCoche(80);

        coche1.apagarMotor();
    }
}