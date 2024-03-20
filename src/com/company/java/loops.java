package com.company.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        int  i = 1;
//        while(i<=200){
//            System.out.println(i);
//            i++;}
//        Do while loop
//        int a = 0;
//        do{
//            System.out.println(a);
//            a++;
//        }while(a<5);
        // for loop
        System.out.print("enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i>0;i--){

            System.out.println(i);
        }
    }
}
