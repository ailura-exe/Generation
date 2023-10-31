import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //eliminar elementos duplicados de una lista

        List<Integer> num=new ArrayList<>();

        num.add(6);
        num.add(7);
        num.add(6);
        num.add(15);
        num.add(7);

        //crear set para eliminar duplicados
        Set<Integer> numerosUnicos=new HashSet<>(num);
        //crear lista con los datos sin duplicar
        List<Integer> listaSinDuplicados=new ArrayList<>(numerosUnicos);

        System.out.println(listaSinDuplicados);
    }
}