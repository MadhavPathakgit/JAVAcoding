package com.company.binarySearch;

public class orderAgnosticBS {
    static int orderAgnosticBS(int[] arr , int target) {
        int start = 0;
        int end = arr.length - 1;
        // find whether the array is sorted in ascending or descending;
        boolean isAsc = arr[ start ] < arr[ end ];

        while ( start <= end ) {
            int mid = start + ( end - start ) / 2;

            if ( arr[ mid ] == target ) {
                // ans element found
                return mid;
            }

            // find the middle element in ascending order
            if ( isAsc ) {
                if ( arr[ mid ] > target ) {
                    end = mid - 1;
                } else if ( arr[ mid ] < target ) {
                    start = mid + 1;
                }
            } else {
                if ( arr[ mid ] > target ) {
                    start = mid - 1;
                } else {
                    end = mid + 1;
                }
            }


        }

        return - 1;


    }
    public static void main(String[] args) {
        int [] num = {89,999,45,21,20};
        int target  = 999;
        System.out.println(orderAgnosticBS(num,target));

    }
}
