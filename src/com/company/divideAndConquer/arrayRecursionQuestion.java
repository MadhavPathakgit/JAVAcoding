package com.company.divideAndConquer;

public class arrayRecursionQuestion {
    public static void main( String[] args ) {
        int arr[]={1,2,12,7,8,9};
        int target = 9;
        System.out.println(SearchTarget( arr,target,0 ));
        System.out.println(isSorted( arr,0 ));

    }
    public static boolean isSorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index] <arr[ index+1 ]){
           return  isSorted( arr,index+1 );
        }
        return false;


    }
    public static boolean SearchTarget(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        if(arr[index ]== target){
            return true;
        }
        return SearchTarget( arr,target,index+1 );
    }
}
