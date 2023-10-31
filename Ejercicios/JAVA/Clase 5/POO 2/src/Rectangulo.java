public class Rectangulo {
    private double largo;
    private double ancho;

    //constructor para inicializar el alto y el ancho
    public Rectangulo(double largo, double ancho){
        this.largo=largo;
        this.ancho=ancho;
    }

    //método para calcular el area

    public double calcularArea(){
        return largo*ancho;
    }

}
