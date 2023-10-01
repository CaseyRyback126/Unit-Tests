package TestsForIsOddEven;

import IsOddAndIsNumberInInterval.NumberUtils;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestNumberInterval {
    @Test
    public void testNumberInIntervalInside() {
        assertTrue(NumberUtils.numberInInterval(30)); // Внутри интервала
        assertTrue(NumberUtils.numberInInterval(50)); // Внутри интервала
        assertTrue(NumberUtils.numberInInterval(99)); // Внутри интервала
    }

    @Test
    public void testNumberInIntervalBoundary() {
        assertFalse(NumberUtils.numberInInterval(25)); // Нижняя граница (исключающая)
        assertFalse(NumberUtils.numberInInterval(100)); // Верхняя граница (исключающая)
    }

    @Test
    public void testNumberInIntervalOutside() {
        assertFalse(NumberUtils.numberInInterval(10)); // За пределами интервала (меньше нижней границы)
        assertFalse(NumberUtils.numberInInterval(150)); // За пределами интервала (больше верхней границы)
    }
}
