package com.company.binarySearch;

public class rBSduplicateElement {
    public static void main( String[] args ) {
        int [] nums = {2,2,3,4,5,6,7,9,0,0,0,0,0,0,0,0,01};
        int pivot = findPivot( nums );
        System.out.println(pivot);
        int  noOfRotation = pivot+1;
        System.out.println(noOfRotation);
//        System.out.println(search( nums,9,pivot ));
    }

    static int search(int[]nums,int target,int pivot ) {

        if ( pivot == target ) {
            return binarySearch( nums , target , 0 , nums.length - 1 );
        }
        if ( target >= nums[ 0 ] ) {
            return binarySearch( nums , target , 0 , pivot - 1 );


        }

        return binarySearch( nums , target , pivot + 1 , nums.length - 1 );

    }


        static int binarySearch(int[]arr ,int target,int start, int end){

        while(start<=end){
            // find the middle element
            int mid = start+(end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                // ans element found
                return mid;
            }
        }
        return -1;


    }
    public  static  int findPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            /// 4 cases
            int mid  = start +(end-start)/2;
            if( mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if( mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]== arr[start]|| arr[mid]== arr[end]){
              if(arr[start]>arr[start+1]){
                  return start;
              }
              start++;
              if(arr[end]<arr[end-1]){
                  return end-1;
              }
              end--;

            }
            // left side is sorted so pivot should be in right
            else if(arr[start]<arr[mid]|| arr[start]== arr[end] && arr[mid]>arr[end])
            {start = mid+1;}
            else{ end = mid-1;}


        }
        return -1;
    }
}
