package kp.home.day2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class DayTwoTest {

    @Test
    void testGetLevels() {
        List<Integer> a = Arrays.asList(7, 6, 4, 2, 1);
        List<Integer> b = Arrays.asList(1, 2, 7, 8, 9);
        List<Integer> c = Arrays.asList(9, 7, 6, 2, 1);
        List<Integer> d = Arrays.asList(1, 3, 2, 4, 5);
        List<Integer> e = Arrays.asList(8, 6, 4, 4, 1);
        List<Integer> f = Arrays.asList(1, 3, 6, 7, 9);

        DayTwo two = new DayTwo();
        Assertions.assertTrue(two.isSafe(a));
        Assertions.assertFalse(two.isSafe(b));
        Assertions.assertFalse(two.isSafe(c));
        Assertions.assertFalse(two.isSafe(d));
        Assertions.assertFalse(two.isSafe(e));
        Assertions.assertTrue(two.isSafe(f));
    }
}