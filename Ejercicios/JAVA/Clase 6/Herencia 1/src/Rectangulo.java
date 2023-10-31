
//clase derivada
public class Rectangulo extends figuraGeometrica {
    public Rectangulo(double base, double altura){
        super(base, altura);
    }


    @Override
    public double calcularArea(){
        return base*altura;
    }
}
