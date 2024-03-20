package com.company.linearsearch;

import java.util.Arrays;

public class searchin2dArray {
    public static  int[] search(int[][] arr,int target){
        for ( int i = 0 ; i < arr.length ; i++ ) {
//            int element = 0;
            for ( int j = 0 ; j < arr[ i ].length ; j++ ) {
                if ( target == arr[ i ][ j ] ) {
                    return new int[]{i , j};

                }


            }

        }
        return new int[]{- 1 , - 1};


    }
    public static  int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for ( int i = 0; i < arr.length; i++ ) {

            for ( int j = 0; j < arr[ i ].length; j++ ) {
                if ( max < arr[ i ][ j ] ) {
                    max = arr[ i ][ j ];
                }


            }

        }
        return max;



    }

    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target = 2;
       int [] ans =  search(arr,target);
//       for(int i=0;i<ans.length;i++){
//           System.out.print(i);
//           System.out.print(" ");
//       }
      System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));

    }
}
