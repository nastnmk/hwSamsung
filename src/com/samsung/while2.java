package com.samsung;


import java.util.Scanner;

public class while2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            int a = scanner.nextInt();
            if (a>10) sum+=a;
            if (a%5==0){
                break;
            }

        }
        System.out.println(sum);
    }
}