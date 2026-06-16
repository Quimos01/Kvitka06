import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2.0, 3.0), "Addition is not working properly");
    }

    @Test
    public void testSubtract() {
        assertEquals(2.0, calculator.subtract(5.0, 3.0), "Subtraction is not working properly");
    }

    @Test
    public void testMultiply() {
        assertEquals(8.0, calculator.multiply(4.0, 2.0), "Multiplication is not working properly");
    }

    @Test
    public void testDivide() {
        assertEquals(5.0, calculator.divide(10.0, 2.0), "Division is not working properly");
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10.0, 0.0);
        });

        assertEquals("Dividing by zero is not possible!", exception.getMessage());
    }
}