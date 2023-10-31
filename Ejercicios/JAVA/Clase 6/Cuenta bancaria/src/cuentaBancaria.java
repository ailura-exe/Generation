public class cuentaBancaria {

    private int saldo;
    private String titular;


    //constructor
    public cuentaBancaria(int saldo, String titular){
        this.saldo=saldo;
        this.titular=titular;

    }

    public int getSaldo(){
        return saldo;
    }
    public void setSaldo(int saldo){
        this.saldo=saldo;
    }

    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular=titular;
    }
}
