package kp.home;

import kp.home.day1.DayOne;
import kp.home.day2.DayTwo;
import kp.home.day3.DayThree;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Day One
//        DayOne one = new DayOne();
//        System.out.println(one.importListAndCalculate("src/main/java/kp/home/day1/input.csv", false));

//        DayTwo two = new DayTwo();
//        System.out.println(two.importListAndCalculate("src/main/java/kp/home/day2/input.txt"));

        DayThree three = new DayThree();
        System.out.println(three.parseAndExecute(three.pattern));

    }


}