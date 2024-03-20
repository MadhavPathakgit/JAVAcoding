package com.company.java;

import java.util.Scanner;

public class continueStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        long c = sc.nextLong();
        byte d = sc.nextByte();
        String s = sc.next();




        for(int i=0;i<10;i++){
            if(i==5)
                break;

            System.out.println(i);

        }

    }

}
