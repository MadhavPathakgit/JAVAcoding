package com.company.BubbleShort;

import java.util.Arrays;

public class bubbleSort {
    public static void main( String[] args ) {
        int [] arr = {5,4,3,2,1,7};
bubble( arr );
        System.out.println( Arrays.toString(arr ));
    }
    static void bubble(int[] arr){
        boolean swapped = false;
        for(int i =0;i<arr.length;i++){
            swapped = false;
            
 for(int j = 1;j<arr.length-i;j++){
//     swap if the item is smaller  than the previous item
     if(arr[j]<arr[j-1]){
         int temp = arr[j];
         arr[j] = arr[j-1];
         arr[j-1] = temp;
         swapped = true;
     }


 }
            if(!swapped){
                break;
            }
        }
    }

}
