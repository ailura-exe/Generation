public class Main {
    public static void main(String[] args) {
        cuentaBancaria cuenta =new cuentaBancaria(1500000, "Jimmy");

        System.out.println("El saldo actual es: "+cuenta.getSaldo());

        cuenta.setSaldo(250000);
        System.out.println(cuenta.getTitular()+", el saldo después del retiro es: " +cuenta.getSaldo());

    }
}