public class Main {
    public static void main(String[] args) {

        Persona persona1=new Persona("Juli", 25);
        Persona persona2=new Persona("Jimmy", 27);


        System.out.println("Datos de la persona 1: ");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: "+ persona1.getEdad());

        System.out.println("\nDatos de la persona 2: ");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: "+ persona2.getEdad());


    }

}