public class Persona {
    private String nombre;
    private int edad;

//Constructor para inicializar nombre y edad

    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    //método para mostrar información de persona

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}


