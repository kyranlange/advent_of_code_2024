package kp.home.day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayOneTest {

    @Test
    void calculateDistance() {
        List<Integer> a = Arrays.asList(3, 4, 2, 1, 3, 3);
        List<Integer> b = Arrays.asList(4, 3, 5, 3, 9, 3);
        DayOne one = new DayOne();

        int distance = one.calculateDistance(a, b);
        assertEquals(11, distance);
    }

    @Test
    void calculateSimilarity() {
        List<Integer> a = Arrays.asList(3, 4, 2, 1, 3, 3);
        List<Integer> b = Arrays.asList(4, 3, 5, 3, 9, 3);
        DayOne one = new DayOne();

        int similarity = one.calculateSimilarity(a, b);
        assertEquals(31, similarity);
    }
}