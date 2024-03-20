package com.company.java;

public class fibonacci {
    static int fibonacci(int x){
        if(x==0||x==1) {
            return 1;
        }
        else{
            return  fibonacci(x-1)+fibonacci(x-2);
        }

    }
    public static void main(String[] args) {
        int x = 4;
        for(int i = 0;i<x;i++){
            System.out.println(fibonacci(i));
        }

//        int fibosum = fibonacci(x);
//        System.out.print("the sum of fibonacci sequence for x terms is:");
//        System.out.print(fibosum);



    }
}
