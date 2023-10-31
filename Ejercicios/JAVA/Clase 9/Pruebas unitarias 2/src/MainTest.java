import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void esPar() {
        assertTrue(Main.esPar(4));
        assertFalse(Main.esPar(5));
    }
}