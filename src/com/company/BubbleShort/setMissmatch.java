//package com.company.BubbleShort;
//
//public class setMissmatch {
//    public static void main( String[] args ) {
//
//    }
//    public static int[] findErrorNums(int[] nums){
//
//        int i = 0;
//
//        while(i< nums.length){
//            int correctIndex = nums[i]-1;
//            if(nums[i]  != nums[correctIndex]&& nums[i]<nums.length){
//                swapArray( nums,i ,correctIndex);
//
//            }
//            else{
//                i++;
//            }
//            for ( int index = 0;index <nums.length; index++){
//                if(nums[index] != index){
//                    return  new int[]{ index+1,nums[index]};
//                }
//            }
//        }
//        return new int[] { -1,-1};
//    }
//    static void swapArray(int arr[],int first,int second){
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
//    }
//
//}
