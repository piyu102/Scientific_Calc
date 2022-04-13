import org.junit.Assert;
import org.junit.Test;

public class ScientificCalculatorTest {

    private ScientificCalculator scientificCalculator = new ScientificCalculator();
    private static final double DELTA = 1e-15;

    @Test
    public void testcalSquareRootValid() {
        Assert.assertEquals("Square root of positive integer", 4.0, scientificCalculator.calSquareRoot(16), DELTA);
        Assert.assertEquals("Square root of positive integer",3.0, scientificCalculator.calSquareRoot(9), DELTA);
    }

    @Test
    public void testcalFactorialValid() {
        Assert.assertEquals(6, scientificCalculator.calFactorial(3));
        Assert.assertEquals(720, scientificCalculator.calFactorial(6));
    }

    @Test
    public void testcalLogarithmValid() {
        Assert.assertEquals(1.3862943611198906, scientificCalculator.calLogarithm(4), DELTA);
        Assert.assertEquals(1.6094379124341003, scientificCalculator.calLogarithm(5), DELTA);
    }

    @Test
    public void testcalPowerValid() {
        Assert.assertEquals(8.0, scientificCalculator.calPower(2, 3), DELTA);
        Assert.assertEquals(125.0, scientificCalculator.calPower(5, 3), DELTA);
    }

    @Test
    public void testcalSquareRootInValid() {
        Assert.assertNotEquals(3.0, scientificCalculator.calSquareRoot(4), DELTA);
        Assert.assertNotEquals(4, scientificCalculator.calSquareRoot(10), DELTA);
    }

    @Test
    public void testcalFactorialInValid() {
        Assert.assertNotEquals(4, scientificCalculator.calFactorial(2));
        Assert.assertNotEquals(12, scientificCalculator.calFactorial(5));
    }

    @Test
    public void testcalLogarithmInValid() {
        Assert.assertNotEquals(3.0, scientificCalculator.calLogarithm(5), DELTA);
        Assert.assertNotEquals(0.0, scientificCalculator.calLogarithm(11), DELTA);
    }

    @Test
    public void testcalPowerInValid() {
        Assert.assertNotEquals(6.0, scientificCalculator.calPower(4, 4), DELTA);
        Assert.assertNotEquals(10.0, scientificCalculator.calPower(5, 3), DELTA);
    }
}
