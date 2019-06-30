import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeoutException;

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

    @Test
    public void testAddMultipleNumbers() {
        assertEquals(4, StringCalculator.add("1,1,1,1"));
    }
    @Test
    public void testAddHandleNewLines() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }
    @Test
    public void testAddSupportDifferentDelimiters() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }
    @Test
    public void testAddExceptionNegativeNumber() {
        assertThrows(RuntimeException.class, () -> StringCalculator.add("-1,2"));
    }
    @Test
    public void testAddNumbersMoreThan1000ShouldBeIgnored() {
        assertEquals(2, StringCalculator.add("2,1001"));
    }
    @Test
    public void testAddDelimitersCanBeAnyLength() {
        assertEquals(6, StringCalculator.add("//[***]\n1***2***3"));
    }
    @Test
    public void testAddMultipleDelimiters() {
        assertEquals(6, StringCalculator.add("//[*][%]\n1*2%3"));
    }
}