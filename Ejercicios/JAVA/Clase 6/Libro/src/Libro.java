public class Libro {
    private String titulo;
    private String autor;
    private int publicacion;

    //constructor

    public Libro(String titulo, String autor, int publicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.publicacion=publicacion;
    }

    public Libro(){

    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }


    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }


    public int getPublicacion(){
        return publicacion;
    }
    public void setPublicacion(int publicacion){
        this.publicacion=publicacion;
    }
}
