package com.company.BubbleShort;

public class duplicateElement {
    public static void main( String[] args ) {

    }
    public static int findDuplicate(int[] nums){
        int i = 0;

        while(i< nums.length){
            if(nums[i] != i+1){
            int correctIndex = nums[i]-1;
            if(nums[i]  != nums[correctIndex] ){
                swapArray( nums,i ,correctIndex);

            }
            else{
               return nums[i];
            } }
            else
            { i++;}

    }
return -1;
}
    public    static void swapArray(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }}
