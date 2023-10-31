import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Conjunto de nombres unicos que se almacenan en un contenedor
        Set<String> nombres=new HashSet<>();    //set, coleccion de elementos unicos, hashset almacena los elementos desordenados y no permite duplicar datos

        nombres.add("Juli");
        nombres.add("Valen");
        nombres.add("Catt");
        nombres.add("Catt");

        System.out.println("Los nombres que se ingresaron son: "+nombres);
    }
}