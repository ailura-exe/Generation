public class Main {
    public static void main(String[] args) {
       //programa con bucle while que imprima todos los numeros pares del 1 al 20
        //excepto el numero 10
        int i =1;
            while (i<=20){
                if(i!=10 && i%2==0){
                    System.out.println(i);
                }
                i++;
            }
    }
}