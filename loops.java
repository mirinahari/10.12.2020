package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        int x = 1;

        while (x <= 3) {
            System.out.println(x);
            x = x + 1;
        }

        // print 3,2,1
        x = 3;
        while (x >= 1) {
            System.out.println(x);
            //"x is 3"
            //"x is 2"
            //"x is 1"
            //System.out.println(String.format("x is %d", x));
            x--;
            // x = x - 1;
            // x -= 1;
            // x--;
        }

        // nextInt
        Scanner s = new Scanner(System.in);
        System.out.println("Enter x: (until positive)");
        x = s.nextInt();
        while (x <= 0) {
            System.out.println("you entered negative or zero...");
            x = s.nextInt();
        }

        // here ... x is positive! x > 0
        System.out.println(String.format("finally you entered positive: %d", x));

        // nextInt until user guessed this number (77)
        System.out.println("Please guess a number");
        int guess = s.nextInt();
        while (guess != 77) {
            System.out.println("Wrong! guess again!");
            guess = s.nextInt();
        }
        System.out.println("Correct !!! 77 was the lucky number!");


        System.out.println("Goodbye...");
    }
}
