import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumberListComparatorTest {
    @Test
    public void testCompareAverageFirstListGreater() {
        NumberListComparator comparator = new NumberListComparator();
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(1, 2);

        String result = comparator.compareAverage(list1, list2);

        assertEquals("Первый список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverageSecondListGreater() {
        NumberListComparator comparator = new NumberListComparator();
        List<Integer> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(1, 2, 3);

        String result = comparator.compareAverage(list1, list2);

        assertEquals("Второй список имеет большее среднее значение", result);
    }

    @Test
    public void testCompareAverageEqualAverages() {
        NumberListComparator comparator = new NumberListComparator();
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(2, 3, 1);

        String result = comparator.compareAverage(list1, list2);

        assertEquals("Средние значения равны", result);
    }

    @Test
    public void testCompareAverageEmptyLists() {
        NumberListComparator comparator = new NumberListComparator();
        List<Integer> list1 = List.of();
        List<Integer> list2 = List.of();

        String result = comparator.compareAverage(list1, list2);

        assertEquals("Средние значения равны", result);
    }
}
