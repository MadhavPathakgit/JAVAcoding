package com.company.BubbleShort;

import java.util.Arrays;

public class SelectionSort {
    public static void main( String[] args ) {
        int [] arr = {5,4,3,2,1,7};
        SelectionSort( arr );
        System.out.println( Arrays.toString(arr ));

    }
    static void SelectionSort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int last = arr.length-i-1;
            int  maxIndex  = getMaxIndex(arr,0,last);
              swapArray( arr,maxIndex,last );
        }

    }
    static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i = start;i<=end;i++){
            if(arr[max] <arr[i]){
            max = i;}
        }
return max;
    }
    static void swapArray(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void SelectionSort2(int arr[]){
        for(int i = 0;i<arr.length-1;i++){
            int minPOs = i;
            for(int j = i+1;j< arr.length;j++){
                if(arr[minPOs]<arr[ j ]){
                    minPOs= j;
                }
            }
            int temp = arr[ minPOs ];
            arr[minPOs]= arr[i];
            arr[i]= temp;
        }
    }
}
