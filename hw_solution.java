package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int num1 = s.nextInt();
        System.out.println("Please enter a number: ");
        int num2 = s.nextInt();

        // 1
        if (num1 == 0 && num2 == 0) {
            System.out.println("Both numbers are zero");
        }
        else {
            System.out.println("Not both numbers are zero");
        }

        // 2
        System.out.println("Please enter a number: ");
        int a = s.nextInt();
        System.out.println("Please enter a number: ");
        int b = s.nextInt();
        System.out.println("Please enter a number: ");
        int c = s.nextInt();
        // way 1
        if (a == b && b == c) {
            System.out.println("all numbers are the same");
        }
        else {
            // maybe some are the same
            System.out.println("not all numbers are the same");
        }
        // way 2
        if (a != b || b != c) {
            // some numbers may be the same
            System.out.println("not all numbers are the same");
        }
        else {
            System.out.println("all numbers are the same");
        }
        // way 3 -- complicated
        // 1 1 1
        // 1 2 1
        // 1 1 2
        // 2 1 2
        // 1 2 2
        if (a == b && a == c) {
            System.out.println("all the same");
        }
        else if (a == c || b == c) {
            System.out.println("some are the same");
        }
        else {
            System.out.println("all different");
        }
        // way 4
        if (a != b && a != c && b != c) {
            System.out.println("all different");
        }
        else if (a == b || a == c || b == c) {
            System.out.println("some are the same");
        }
        else {
            System.out.println("all different");
        }

        // 3
        System.out.println("Please enter a number(f): ");
        float x = s.nextFloat();
        System.out.println("Please enter a number(f): ");
        float y = s.nextFloat();
        System.out.println("Please enter a number(f): ");
        float z = s.nextFloat();
        // way 1 -- count
        int count = 0;
        if (x > 0) {
            count++;
        }
        if (y > 0) {
            count++;
        }
        if (z > 0) {
            count++;
        }
        // 0 positive number
        // 1 positive number
        // 2 positive number
        // 3 positive number
        System.out.print(count);
        System.out.println(" positive number");

        // a > 0 b > 0 c > 0 ==> 3
        // a > 0 b > 0 or
        // a > 0 c > 0 or
        // b > 0 c > 0 ==> 2
        // a > 0 or
        // b > 0 or
        // c > 0 ==> 1
        // else none ==> 0
        if (a > 0 && b > 0 && c > 0) {
            System.out.println("3 positives");
        }
        else if (a > 0 && b > 0 || a > 0 && c > 0 || b > 0 && c > 0) {
            System.out.println("2 positives");
        }
        else if (a > 0 || b > 0 || c > 0) {
            System.out.println("1 positive");
        }
        else {
            System.out.println("0 positives");
        }

        // 4
        System.out.println("Please enter a number(f): ");
        a = s.nextInt();
        System.out.println("Please enter a number(f): ");
        b = s.nextInt();
        System.out.println("Please enter a number(f): ");
        c = s.nextInt();
        // a > b && a > c ==> a biggest
        // else: b > c ==> b biggest
        // else: c biggest
        if (a == b && a == c && b == c) {
            System.out.println("all same");
        }
        else if (a > b && a > c) {
            System.out.println(a);
        }
        else if (b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }

        System.out.println("Goodbye...");
    }
}
