package com.company.binarySearch;

public class binarySearch {
    static int binarySearch(int[]arr ,int target){
        int start =0;
        int end = arr.length-1;
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
    public static void main(String[] args) {
        int []num = { 1,2,3,4,5,6,7,9,8,};
        int target = 3;
        System.out.println(binarySearch(num,target));

    }
}
