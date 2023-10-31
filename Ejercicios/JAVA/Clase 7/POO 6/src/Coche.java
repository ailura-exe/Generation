public class Coche {

    private String modelo;
    private int velocidad;
    private boolean motorEncendido;


    public Coche (String modelo){
        this.modelo=modelo;
        this.velocidad=0;
        this.motorEncendido=false;
    }
    public void encenderMotor(){
        motorEncendido=true;
        System.out.println("El motor está encendido");
    }
    public void apagarMotor(){
        motorEncendido=true;
        velocidad=0;
        System.out.println("El motor está apagado");
    }
    public void acelerarCoche(int incremento){
        if(motorEncendido){
            velocidad+=incremento;
            System.out.println("Acelerando, velocidad actual: "+velocidad+"km/h");
        }else{
            System.out.println("El motor está apagado, no se puede acelerar");
        }
    }
    public void frenarCoche(int decremento){
        if (motorEncendido){
            if (velocidad>=decremento){
                velocidad-=decremento;
                System.out.println("Frenando, valocidad actual: "+velocidad+"km/h");
            }else {
                System.out.println("todavía no puedes frenar");
            }
        }else{
            System.out.println("El motor está apagado no puedes frenar");
        }
    }
}
