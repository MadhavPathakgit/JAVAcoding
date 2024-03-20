//package com.company.binarySearch;
//
//public class peakElementInArray {
//    public static void main( String[] args ) {
//        /// 1095 , 162 ,852 leet code
//
//
//    }
////    public int  Search(int[] arr,int target){
//        int peak = peakIndexMountainArray( arr );
//        int firstTry = orderAgnosticBS( arr,target,0,peak );
//if(firstTry!= -1){
//    return firstTry;
//}
//return orderAgnosticBS( arr,target,peak+1,arr.length-1 );
//    }
//
//    public  int peakIndexMountainArray( int[] arr ) {
//        int start = 0;
//        int end = arr.length-1;
//
//            while (start<end  ) {
//                int mid = start + ( end - start ) / 2;
//                if ( arr[ mid ] < arr[ mid + 1 ] ) {
//                    // you are in asc part of array
//
//                 start = mid+1;
//                 // because we know that mid+1 element> mid element
//
//                }
//                else{// you are in dec part of array
//// this may be the answer ,but look at left
//                    // this is why end!= mid-1;
//                    end = mid;
//                }
//            }
//            // int the end ,start ==  end and pointing to the largest number because of the 2 checks
//        // hence the start and end are always trying to find the max element in the above 2 checks
//        //  hence when they are pointing to just one element that is the answer
//        // every point of time of start and end they have the best possible answer till that time
//        // and if we are saying that only one element is remaining ,hence cux of above line that is the best possible answer
//
//return start ;
//
//    }
//    public int orderAgnosticBS(int[] arr , int target,int start , int end) {
//        int start = 0;
//        int end = arr.length - 1;
//        // find whether the array is sorted in ascending or descending;
//        boolean isAsc = arr[ start ] < arr[ end ];
//
//        while ( start <= end ) {
//            int mid = start + ( end - start ) / 2;
//
//            if ( arr[ mid ] == target ) {
//                // ans element found
//                return mid;
//            }
//
//            // find the middle element in ascending order
//            if ( isAsc ) {
//                if ( arr[ mid ] > target ) {
//                    end = mid - 1;
//                } else if ( arr[ mid ] < target ) {
//                    start = mid + 1;
//                }
//            } else {
//                if ( arr[ mid ] > target ) {
//                    start = mid - 1;
//                } else {
//                    end = mid + 1;
//                }
//            }
//
//
//        }
//
//        return - 1;
//
//
//    }
//}