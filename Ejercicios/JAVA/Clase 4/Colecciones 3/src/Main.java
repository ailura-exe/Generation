import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //mapeo de estudiantes con sus calificaciones

        Map<String, Double> calificaciones=new HashMap<>(); //mapa para almacenar datos

        calificaciones.put("Juli", 4.9);
        calificaciones.put("Vale", 4.8); //agregar datos al mapa
        calificaciones.put("Catt", 5.0);

        String estudiante="Juli";   //obtener e imprimir calificacion
        double calificacion= calificaciones.get(estudiante);

        System.out.println(estudiante +" obtuvo "+calificacion);
    }
}