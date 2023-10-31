public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();

        libro1.setTitulo("Inferno");
        libro1.setAutor("Dan Brown");
        libro1.setPublicacion(2013);

        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getPublicacion());
    }
}