package com.javacourse.se.calculator2;

import java.util.Arrays;
import java.util.Scanner;


public class Calculator2 {
    boolean itIsRoman = false;

    public static void main(String[] args) {
        Calculator2 calc = new Calculator2();
        calc.start();

    }

    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT: ");

        String inputString = in.nextLine();

        String[] a = inputString.split("[+-/*]", 0);
        System.out.println(Arrays.toString(a));


        String operation = inputString.replaceAll("[0-9,A-Z,a-z]", "");


        int result = 0;

        if (operation.equals("+") && romanToInt(a[0]) < 11 && romanToInt(a[1]) < 11) {
            result = romanToInt(a[0]) + romanToInt(a[1]);

        } else if (operation.equals("-") && romanToInt(a[0]) < 11 && romanToInt(a[1]) < 11) {
            result = romanToInt(a[0]) - romanToInt(a[1]);

        } else if (operation.equals("*") && romanToInt(a[0]) < 11 && romanToInt(a[1]) < 11) {
            result = romanToInt(a[0]) * romanToInt(a[1]);
        } else if (operation.equals("/") && romanToInt(a[0]) < 11 && romanToInt(a[1]) < 11) {
            result = romanToInt(a[0]) / romanToInt(a[1]);
        }
        if (itIsRoman) {
            System.out.println("OUTPUT: " + RomanNumber.toRoman(result));
        } else {
            System.out.println("OUTPUT: " + result);
        }
        if (romanToInt(a[0]) > 10) {
            System.out.println("Одно из введенных чисел больше 10");
            System.out.println("Программа завершена");
            System.exit(0);
        } else if (romanToInt(a[1]) > 10) {
            System.out.println("Одно из введенных чисел больше 10");
            System.out.println("Программа завершена");
            System.exit(0);
        }
    }

    public int romanToInt(String a) {
        itIsRoman = true;
        if (a.equals("I"))
            return 1;
        if (a.equals("II"))
            return 2;
        if (a.equals("III"))
            return 3;
        if (a.equals("IV"))
            return 4;
        if (a.equals("V"))
            return 5;
        if (a.equals("VI"))
            return 6;
        if (a.equals("VII"))
            return 7;
        if (a.equals("VIII"))
            return 8;
        if (a.equals("IX"))
            return 9;
        if (a.equals("X"))
            return 10;
        itIsRoman = false;
        return Integer.parseInt(a);

    }

}