import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void sumar() {
        int resultado=Main.sumar(3,5);
        assertEquals(8, resultado);
    }
}