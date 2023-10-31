public class Persona {

    private String nombre;
    private int edad;
    private String documentoIdentidad;

    //Constructor
    public Persona(String nombre, int edad, String documentoIdentidad){
        this.nombre=nombre;
        this.edad=edad;
        this.documentoIdentidad=documentoIdentidad;
    }
    //Métodos get y set

    public String getNombre(){
        return nombre;
    }

    public void setNombre(){
        this.nombre=nombre;
    }

}
