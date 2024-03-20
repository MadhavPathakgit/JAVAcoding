package com.company.binarySearch;

public class rotatedbinarySearch {
    // 33 leet code

    public static void main( String[] args ) {
        int [] nums = {4,5,6,7,0,1,2};
        System.out.println( findPivot(nums));

    }
    static int search(int[]nums,int target){

        int pivot = findPivot( nums );
        if(pivot== target){
            return binarySearch( nums,target,0,nums.length-1 );
        }
        if(target>=nums[ 0 ]){
            return binarySearch( nums,target,0,pivot-1 );


        }

            return binarySearch( nums,target,pivot+1, nums.length-1 );



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
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }



        }
        return -1;
    }

}
