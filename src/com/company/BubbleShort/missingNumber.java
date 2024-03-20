package com.company.BubbleShort;

public class missingNumber {
 public    static int missingNumber(int[] nums){
        int i = 0;

        while(i< nums.length){
            int correctIndex = nums[i];
            if(nums[i]  != nums[correctIndex]&& nums[i]<nums.length){
                swapArray( nums,i ,correctIndex);

            }
            else{
                i++;
            }}
            for ( int index = 0;index <nums.length; index++){
                if(nums[index] != index){
                    return index  ;
                }
            }

        return nums.length;
    }
    static void swapArray(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
