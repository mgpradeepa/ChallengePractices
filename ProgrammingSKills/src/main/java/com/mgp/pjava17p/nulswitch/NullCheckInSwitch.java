package com.mgp.pjava17p.nulswitch;

import java.util.Scanner;

import static java.util.Calendar.*;

public class NullCheckInSwitch {
    public static void main(String[] args) {
        System.out.println("Enter a number to check switch");
        int s = new Scanner(System.in).nextInt();
        switch (s) {
            case 1,7 -> System.out.println("Prime number");
            case 2,8 -> System.out.println("Even numbers");

            case 0 -> System.out.println("Undefined");
            default -> System.out.println("Not a number");

        }
        System.out.println(checkWhetherStringis(s));

    }

    private static String checkWhetherStringis(int num) {
        return switch (num) {
            case SUNDAY, SATURDAY -> "Weekend";
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Weekday";
            default -> "Undefined";
        };
    }

}
