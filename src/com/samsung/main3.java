package com.samsung;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
/*        int number = 123;
        int rest = number % 3;
        if (rest == 0){
            System.out.println("Делится на 3");
        }
        else if (rest == 1){
            System.out.println("Остаток 1");
        }
        else System.out.println("Остаток 2");*/


        /*boolean isTicket = false;
        boolean isVIP = true;
        boolean canCome = age >  18 && (isTicket || isVIP);
        if (canCome) {
            System.out.println("Проходите");
        }
        else System.out.println("Разворот");*/

        /*int age = 16;
        System.out.println(age >= 18 ? "СВ" : "НС");
        boolean isAdult = age >= 18 ? true : false;
        */
        int day = 5;
        switch (day){
            case 1:
                System.out.println("Mn");
                break;
            case 2:
                System.out.println("Ts");
                break;
            case 3:
                System.out.println("Wn");
                break;
            case 4:
                System.out.println("Tr");
                break;
            case 5:
                System.out.println("Fr");
                break;
            case 6:
                System.out.println("St");
                break;
            case 7:
                System.out.println("Sn");
                break;
            default:
                System.out.println("Некорректно");

        }
        int a = switch(day){
            case 1,3, 5 -> 1;
            case 2, 4, 6 -> 0;
            default -> -1;
        }
    }

}

