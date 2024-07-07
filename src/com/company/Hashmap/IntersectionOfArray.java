package com.company.Hashmap;

import java.util.HashSet;

public class IntersectionOfArray {
    public static void main( String[] args ) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        int[] arr1 = { 1 , 1 , 4 , 5 , 7 , 8 , 5 , 25 };
        int[] arr2 = { 1 , 5 , 5 , 4 , 1 , 1 , 2 , 4 };
        int count = 0;
        for ( int i = 0 ; i < arr1.length ; i++ ) set.add( arr1[ i ] );
        for ( int i = 0 ; i < arr2.length ; i++ ) {
            if ( set.contains( arr2[ i ] ) ) {
//               count++;
                set2.add( arr2[ i ] );
                set.remove( arr2[ i ] );
            }
        }
        System.out.println( "intersection of these array are=" + set2 );
    }

}
