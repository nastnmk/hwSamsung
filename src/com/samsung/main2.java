package com.samsung;
import java.util.Locale;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        /*int a = 32;
        byte aByte = 127;
        short aShort = 3000;
        int aInt = 20;
        long aLong = 2000000000000L;
        char aChar = 97;
        double aDouble = 2.24954;
        double bDouble = aInt;
        boolean bool = false;
        System.out.println(aDouble);*/

//        Scanner in = new Scanner(System.in);
//        in.useLocale(Locale.US);
//        aDouble = in.nextDouble();
//        System.out.println(aDouble);
        int a = 11, b = 4;
        double res;
        res = a + b;
        res = a - b;
        res = a * b;
        res = (a + 0.0) / b;
        res = (int) Math.pow(3, 2);
        res = (a%100 - a%10) / 10;
        res = a/10 % 10;
        res++;
        res--;
        ++res;
        --res;
        res = 23;
        System.out.println(res++);
        System.out.println(res);

    }
}
