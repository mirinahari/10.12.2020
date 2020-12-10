package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        System.out.print("You entered ");
        System.out.println(x);

        /* https://dzone.com/articles/java-string-format-examples */
        System.out.println(String.format("You entered %d", x));
        System.out.println(String.format("%d was the number", x));
        System.out.println(String.format("%d + %d = %d", x, y, x+y));
        System.out.print(x);
        System.out.println(" + ");
        System.out.println(y);
        System.out.println(" = ");
        System.out.println(x+y);

        System.out.println("Goodbye...");
    }
}
