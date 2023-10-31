public class figuraGeometrica {

    //los atributos son protegidos para que las clases derivadas puedan acceder

    protected double base;
    protected double altura;


    public figuraGeometrica(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    public double calcularArea(){
        return 0;
    }
}
