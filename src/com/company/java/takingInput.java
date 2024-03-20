package com.company.java;
import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
        System.out.println("enter no 1");
        int a = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum  of these number is");
        System.out.println(sum);



    }
}
