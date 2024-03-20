package com.company.binarySearch;

public class elementPositionInfiniteArray {

         static int ans(int[]arr,int target){
        // find the range
             int start = 0;
             int end = 1;
             // condition for the target to lie in the range
             while (target>arr[end]){
                 // newstart work as a temp
             int temp   = end+1;
                end = end+ (end- start + 1) * 2;
                start = temp;
             };
             return binarySearch( arr,target,start ,end );

              }
    static int binarySearch(int[]arr ,int target,int start,int end) {

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
        return - 1;
    }
        public static void main( String[] args ) {
        int[] arr = {3,5,7,9,10,90,100,130,160,170,180,190,200,300,400,500,600,700,800,900};
//        System.out.println(nums.length);
           int target = 100 ;
        System.out.println(ans( arr,target));
    }

}
