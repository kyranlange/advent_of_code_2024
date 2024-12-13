package kp.home.day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DayOne {

    /**
     * Import the puzzle input and calculate the distance.
     *
     * @param fileName The path of the file that contains the input
     * @param distance if true, calculate distance otherwise calculate similarity
     * @return The distance between the two lists in the input file
     */
    public int importListAndCalculate(String fileName, boolean distance) {
        Path path = Paths.get(fileName);

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(path);
            for (String s : lines) {
                String[] line = s.split("   ");
                a.add(Integer.parseInt(line[0].strip()));
                b.add(Integer.parseInt(line[1].strip()));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            //ignore
        }

        if (distance) {
            return calculateDistance(a, b);
        } else {
            return calculateSimilarity(a, b);
        }
    }

    public int calculateDistance(List<Integer> a, List<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);

        int distance = 0;
        int diff;

        for (int i = 0; i < a.size(); i++) {
            diff = Math.abs(a.get(i) - b.get(i));
            distance += diff;
        }

        return distance;
    }

    public int calculateSimilarity(List<Integer> a, List<Integer> b) {
        int similarity = 0;

        for (int i = 0; i < a.size(); i++) {
            int x = a.get(i);
            int count = 0;
            for (Integer j : b) {
                if ((int) j == x) {
                    count++;
                }
            }
            similarity += (x * count);
        }

        return similarity;
    }
}
