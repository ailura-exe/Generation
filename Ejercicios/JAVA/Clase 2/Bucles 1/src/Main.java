public class Main {

    public static void main(String[] args) {
        //Un programa que sume todos los elementos de un arreglo
        int [] numeros={1,2,3,4,5}; //el arreglo que inicializa con corchetes pero se le añaden datos con llaves
        int suma=0;

        /*for(int numero:numeros){
            suma+=numero;                  //For of
        }*/

        for (int i= 0; i<= numeros.length; i++);{
            suma+=numeros[i];
        }

        System.out.println("La suma es: "+suma);

    }
}