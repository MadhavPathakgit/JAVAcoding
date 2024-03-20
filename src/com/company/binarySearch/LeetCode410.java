package com.company.binarySearch;

public class LeetCode410 {
    public static void main( String[] args ) {

    }
    public static int splitArray(int[]nums,int m){
        int start = 0;
        int end = 0;
        
        for(int i = 0;i< nums.length;i++){
            if(start>nums[i]){
                start = nums[ i ];
            }
            end = end+nums[ i ];

        }
        while(start<end){
            int mid = start+(end-start)/2;
            int sum = 0;
            int pieces = 0;
            for(int i = 0;i< nums.length;i++){
                if(sum+i>mid){
                    sum = i;
                    pieces++;
                }
                else{
                    sum = sum+i;
                }

            }
            if(pieces<m){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}
