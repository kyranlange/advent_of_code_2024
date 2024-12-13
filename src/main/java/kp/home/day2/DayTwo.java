package kp.home.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DayTwo {

    /**
     * Import the puzzle input and calculate the number of safe reports.
     *
     * @param fileName The path of the file that contains the input
     * @return The number of safe reports in the input
     */
    public int importListAndCalculate(String fileName) {
        Path path = Paths.get(fileName);

        int safe = 0;

        try {
            List<String> lines = Files.readAllLines(path);
            for (String s : lines) {
                List<Integer> numberList = Arrays.stream(s.split(" "))
                        .map(Integer::parseInt)
                        .toList();

                if (isSafe(numberList)) {
                    safe++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NumberFormatException e) {
            //ignore
        }

        return safe;
    }


    /**
     * Determine if the levels indicated in the list are safe.
     * A report only counts as safe if both of the following are true:
     *
     *   -  The levels are either all increasing or all decreasing.
     *   -  Any two adjacent levels differ by at least one and at most three.
     *
     * @param report A report containing the different levels
     * @return True if the report is safe, false otherwise
     */
    public boolean isSafe(List<Integer> report) {

        boolean increasing = report.get(1) > report.get(0);

        for (int i = 0; i < report.size() - 1; i++) {
            int a = report.get(i);
            int b = report.get(i+1);

            if (a == b) {
                return false;
            } else if (increasing && b < a) {
                return false;
            } else if (!increasing && a < b) {
                return false;
            }

            if (Math.abs(a - b) > 3) {
                return false;
            }
        }

        return true;
    }
}
