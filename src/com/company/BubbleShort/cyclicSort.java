package com.company.BubbleShort;

import java.util.Arrays;

public class cyclicSort {
    public static void main( String[] args ) {
        int [] arr = {5,4,3,2,1,};
        CyclicSort( arr );
        System.out.println( Arrays.toString(arr ));

    }
    static void CyclicSort(int[] arr){
        int i = 0;

      while(i< arr.length){
   int correctIndex = arr[i]-1;
   if(arr[i]  != arr[correctIndex]){
       swapArray( arr,i ,correctIndex);

          }
   else{
       i++;
   }
      }

    }
    static void swapArray(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
