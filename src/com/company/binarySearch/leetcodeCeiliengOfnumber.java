package com.company.binarySearch;

public class leetcodeCeiliengOfnumber {
    static int ceiling( int[] arr , int target ) {
        // but what if the tare=get is greater than the greatest number in the array;
        if(target>arr[ arr.length - 1]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while ( start <= end ) {
            // find the middle element
            int mid = start + ( end - start ) / 2;
            if ( arr[ mid ] > target ) {
                end = mid - 1;
            } else if ( arr[ mid ] < target ) {
                start = mid + 1;
            } else {
                // ans element found
                return mid;
            }
        }
        // when loop breaks start = end +1;
        //the element smaller than  or equal to target return end which is known as floor
        return start;


    }
    public static void main( String[] args ) {
        int[] num = { 1 , 2 , 3 , 4 , 5 , 7 , 9 , 8 };
        int target = 10;
        int i = ceiling( num , target );
        System.out.print( "the element greater than  or equal to target is at index :" );
        System.out.println( i );

    }
}
