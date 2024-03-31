package com.company.patterns;


public class MaxElementArray {
    public static void main( String[] args ) {
        int[]arr= {1,2,3,4,5,6,7,8,9};
        int largest = Integer.MIN_VALUE;
        for ( int j : arr ) {
            if ( largest < j ) {
                largest = j;
            }
        }
        System.out.println(largest);
    }
}
