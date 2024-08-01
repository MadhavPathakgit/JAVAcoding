package com.company.Recursionn;

public class firstOccurence {
    public static int firstOcr( int[] arr, int key , int i ){
//int i  = 0;
        if( i==arr.length){
            return -1;
        }
        if(arr[i]== key){
            return i;
        }
        return firstOcr( arr,key,i+ 1);
    }
    public static void main( String[] args ) {
        int[] arr = {1,2,3,4,5,5,8,9,8};
        System.out.println(firstOcr( arr,8 , 0 ));
        System.out.println(lastOcr( arr, 8,0));

    }
    public static int lastOcr( int[] arr, int key , int i ){
        if( i==arr.length ){
            return -1;
        }
        int isFound = lastOcr( arr,key,i+1 );
        if(isFound==-1 && arr[i]== key){
            return i;
        }
        return isFound;
    }
}
