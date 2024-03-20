package com.company.Recursion;

public class BinarySearchByRecursion {
    public static void main( String[] args ) {
        int [] nums = {5,6,7,8,9,10};
        System.out.println(search( nums,9,0, nums.length-1 ));

    }
    static int search(int []arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start +(end-start)/2;
        if(target== arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            return  search( arr,target,start, mid-1);

        }
        return  search( arr,target, mid+1,end);

    }
}
