package com.programming.strings;

public class RomanToInteger {

    public static void main(String args[]) {
        String roman = "XC";

        int sum = 0;
        char lastChar = ' ';
        for (int i=0;i <roman.length(); i++) {
            if (roman.charAt(i) == 'M') {
                System.out.println("Sum so far: " + sum);
                if (lastChar == 'C') {
                    sum = sum - 100;
                    sum = sum + 900;
                    System.out.println("subtracted 100; Sum so far: " + sum);
                } else {
                    sum = sum + 1000;
                }
            } else if (roman.charAt(i) == 'D') {
                System.out.println("Sum so far: " + sum);
                if (lastChar == 'C') {
                    sum = sum - 100;
                    sum = sum + 400;
                    System.out.println("subtracted 100; Sum so far: " + sum);
                } else {
                    sum = sum + 500;
                }
            } else if (roman.charAt(i) == 'C') {
                System.out.println("Sum so far: " + sum);
                if (lastChar == 'X') {
                    sum = sum - 10;
                    sum = sum + 90;
                    System.out.println("subtracted 10; Sum so far: " + sum);
                } else {
                    sum = sum + 100;
                }
            } else if (roman.charAt(i) == 'L') {
                System.out.println("Sum so far: " + sum);
                if (lastChar == 'X') {
                    sum = sum - 10;
                    sum = sum + 40;
                    System.out.println("subtracted 10; Sum so far: " + sum);
                } else {
                    sum = sum + 50;
                }
            } else if (roman.charAt(i) == 'X') {
                System.out.println("Sum so far: " + sum);
                if (lastChar == 'I') {
                    sum = sum - 1;
                    sum = sum + 9;
                    System.out.println("subtracted 1; Sum so far: " + sum);
                } else {
                    sum = sum + 10;
                }
            } else if (roman.charAt(i) == 'V') {
                System.out.println("Sum so far: " + sum);
                if (lastChar == 'I') {
                    sum = sum - 1;
                    sum = sum + 4;
                    System.out.println("subtracted 1; Sum so far: " + sum);
                } else {
                    sum = sum + 5;
                }
            } else if (roman.charAt(i) == 'I') {
                sum = sum + 1;
            }
            lastChar = roman.charAt(i);
        }

        System.out.println("Sum is " + sum);
    }
}
