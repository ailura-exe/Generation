public class Main {
    public static void main(String[] args) {
        //Programa que encurentra el numero más grande de un arreglo

        int[] numeros={150,458,365,5,456};

        int maximo=numeros[0];

        for (int i=0; i< numeros.length; i++){
            if (numeros[i]>maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El mayor es: "+maximo);
    }
}