import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(2,2);
    }

    @Test
    public void add() {
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    public void subtract() {
        assertEquals(3, calculator.subtract(7,4));
    }

    @Test
    public void multiply() {
        assertEquals(9, calculator.multiply(3,3));
    }

    @Test
    public void divide() {
        assertEquals(8, calculator.divide(24,3));
    }
}
