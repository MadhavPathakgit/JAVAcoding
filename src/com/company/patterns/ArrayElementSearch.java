package com.company.patterns;
import java.util.*;

public class ArrayElementSearch {
    public static void main( String[] args ) {
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 };

        Scanner sc = new Scanner( System.in );
        System.out.println( "enter the element you want to search" );

        int x = sc.nextInt();
        for ( int i = 0 ; i < arr.length ; i++ ) {
            if ( arr[ i ] == x ) {
                System.out.println("Element Found at Index " +i );
                System.exit(0);
            }

        }
        System.out.println( "Element not Found" );
    }
}


