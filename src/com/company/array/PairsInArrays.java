package com.company.array;

public class PairsInArrays {
    public static void main( String[] args ) {
        int [] numbers = {2,4,6,8,10};
        int totalPairs = 0;
        for(int i = 0;i<numbers.length;i++){
            int curr = numbers[ i ];
            for(int j =i+1;j< numbers.length;j++){
                System.out.println("("+ curr+","+ numbers[j]+")");
               totalPairs++;
            }
            System.out.println();
        }
        System.out.println(totalPairs);
    }
}
