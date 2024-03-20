package com.company.BubbleShort;

import java.util.ArrayList;
import java.util.List;

public class disappearedIInArray {
    public static void main( String[] args ) {

    }
    public static List<Integer> findDisappearedNumbers( int[] nums){
        int i = 0;

        while(i< nums.length){
            int correctIndex = nums[i]-1;
            if(nums[i]  != nums[correctIndex]){
                swapArray( nums,i ,correctIndex);

            }
            else{
                i++;
            }
        }
      List<Integer> ans = new ArrayList<>();
            for ( int index = 0;index <nums.length; index++){
                if(nums[index] != index+1){
              ans .add(index+1);

                }
            }
        return ans;
        }



    static void swapArray(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
