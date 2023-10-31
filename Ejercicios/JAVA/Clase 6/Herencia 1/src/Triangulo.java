

public class Triangulo extends figuraGeometrica {

    public Triangulo(double base, double altura){
        super(base, altura);
    }
    @Override

    public double calcularArea(){
        return (base*altura)/2;
    }

}
