package com.javacourse.se.calculator;


import java.util.Arrays;
import java.util.Scanner;

public class Habsida {
       private Throwable ex;

    public static void main(String[] args) {
        Habsida calc = new Habsida();
        calc.start();

    }

    public void start() {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT: ");

        String inputString = in.nextLine();

        String[] a = inputString.split("[+-/*]", 0);
        System.out.println(Arrays.toString(a));


        String b = a[0];
        String c = a[1];

        int b1 = Integer.parseInt(b);
        int c1 = Integer.parseInt(c);

        if (b1 > 10){
            System.out.println("Одно из введенных чисел больше 10");
            System.out.println("Программа завершена");
            System.exit(0);
        }
        else if (c1 > 10) {
            System.out.println("Одно из введенных чисел больше 10");
            System.out.println("Программа завершена");
            System.exit(0);
                  }


        String operation = inputString.replaceAll("[0-9,A-Z,a-z]", "");


            int result = 0;

            if (operation.equals("+")) {
                result = Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
            } else if (operation.equals("-")) {
                result = Integer.parseInt(a[0]) - Integer.parseInt(a[1]);

            } else if (operation.equals("*")) {
                result = Integer.parseInt(a[0]) * Integer.parseInt(a[1]);
            } else if (operation.equals("/")) {
                result = Integer.parseInt(a[0]) / Integer.parseInt(a[1]);
            }

            System.out.println("OUTPUT: " + result);
        }
    }


