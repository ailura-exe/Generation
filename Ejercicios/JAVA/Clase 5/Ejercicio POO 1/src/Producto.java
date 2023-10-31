import javax.xml.namespace.QName;

public class Producto {
    private String nombre;
    private int codigoBarras;
    private double precioUnitario;
    private int stock;

    //constructor

    public Producto(String nombre, int codigoBarras, double precioUnitario, int stock){
        this.nombre=nombre;
        this.codigoBarras=codigoBarras;
        this.precioUnitario=precioUnitario;
        this.stock=stock;
    }

    //metodos

    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerCodigoBarras(){
        return codigoBarras;
    }
    public double obtenerPrecio(){
        return precioUnitario;
    }
    public int obtenerStock(){
        return stock;

    }
    public int agregarStock(){

    }
    public int vender(){

    }
}
