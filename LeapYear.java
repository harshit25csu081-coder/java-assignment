
/*Required filename: LeapYear.java

Write a program that determines whether an entered year is a Gregorian leap
year.

Requirements:

- Create static boolean isLeapYear(int year).
- Test 2024, 1900, 2000, and 2023.
- Explain why checking only divisibility by 4 is insufficient.*/


import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("2024: " + isLeapYear(2024));
        System.out.println("1900: " + isLeapYear(1900));
        System.out.println("2000: " + isLeapYear(2000));
        System.out.println("2023: " + isLeapYear(2023));
    }

}
        

    