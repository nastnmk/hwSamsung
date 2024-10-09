package com.samsung;

import java.util.Scanner;
public class while1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        while (true){
            int a = scanner.nextInt();
            if (a<0){
                break;
            }
            sum+=1;
        }
        System.out.println(sum);
    }
}