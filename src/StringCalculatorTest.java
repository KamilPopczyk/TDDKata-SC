import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(2, StringCalculator.add("1,1"));
        assertEquals(1, StringCalculator.add("1,"));
    }

    @Test
    public void testAddEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }
}