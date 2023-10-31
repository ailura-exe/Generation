import static org.junit.Assert.*;

public class AreaTest {

    @org.junit.Test
    public void calcularArea() {
        double base=5.0;
        double altura=8.0;

        double expectedArea=(base*altura)/2;

        double actualArea=Area.calcularArea(base, altura);

        assertEquals(expectedArea, actualArea, 0.0001);

    }
}