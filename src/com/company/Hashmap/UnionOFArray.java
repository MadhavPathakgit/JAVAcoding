package com.company.Hashmap;


import java.util.HashSet;

public class UnionOFArray {
    public static void main( String[] args ) {
        int[]arr1= {1,1,4,5,7,8,5,25};
        int[] arr2 ={1,5,5,4,1,1,2,4};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            set.add( arr1[ i ] );
        }
        for(int i = 0;i<arr2.length;i++){
            set.add( arr2[i] );
        }
        System.out.println(set);
    }
}
