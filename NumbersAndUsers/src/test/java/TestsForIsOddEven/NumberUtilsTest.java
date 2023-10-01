package TestsForIsOddEven;

import IsOddAndIsNumberInInterval.NumberUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberUtilsTest {

    @Test
    public void testEvenNumber() {
        assertTrue(NumberUtils.evenOddNumber(4)); // 4 is even
        assertTrue(NumberUtils.evenOddNumber(0)); // 0 is even
        assertFalse(NumberUtils.evenOddNumber(7)); // 7 is odd
        assertTrue(NumberUtils.evenOddNumber(-2)); // -2 is even
    }

    @Test
    public void testOddNumber() {
        assertFalse(NumberUtils.evenOddNumber(3)); // 3 is odd
        assertTrue(NumberUtils.evenOddNumber(2)); // 2 is even
        assertFalse(NumberUtils.evenOddNumber(-5)); // -5 is odd
    }

    @Test
    public void testZero() {
        assertTrue(NumberUtils.evenOddNumber(0)); // 0 is even
    }

    @Test
    public void testNegativeNumber() {
        assertTrue(NumberUtils.evenOddNumber(-6)); // -6 is even
        assertFalse(NumberUtils.evenOddNumber(-9)); // -9 is odd
    }
}