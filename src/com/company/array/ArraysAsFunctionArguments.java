package com.company.array;

import java.util.Scanner;

public class ArraysAsFunctionArguments {
    public static void update(int []array){
        for(int i =0;i< array.length;i++){
            array[i]+= 1;
        }

    }
    public static void main( String[] args ) {
        int [] array = new int[5];
        Scanner sc = new Scanner( System.in );
        for(int i =0;i< array.length;i++){
            array[i]= sc.nextInt();;
        }

        for(int i =0;i< array.length;i++){
            System.out.println(array[i]);
        }
        update( array );
        for(int i =0;i< array.length;i++){
            System.out.println(array[i]);
        }

    }
}
