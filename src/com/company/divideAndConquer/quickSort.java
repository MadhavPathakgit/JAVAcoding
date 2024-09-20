package com.company.divideAndConquer;

public class quickSort {
    public static void QuickSort(int[] arr, int si, int ei){
        if(si>ei){
            return;
        }
        int pivoitIndex  = Partition(arr,si,ei) ;
        QuickSort( arr,si,pivoitIndex-1 );
        QuickSort( arr,pivoitIndex+1,ei );

    }
    public static  int Partition(int[] arr , int si , int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j= si;j<ei;j++) {
            if ( arr[ j ] <= pivot ) {
                i++;
                int temp = arr[ i ];
                arr[ i ] = arr[ j ];
                arr[ j ] = temp;
            }
        }
            i++;
            int temp = pivot;
                    arr[ei]= arr[i];
                    arr[i]= temp;
                    return i;

    }
    public static  void print(int[] arr){
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main( String[] args ) {
        int[] arr = {1,8,4,54,};
        QuickSort(arr,0,arr.length-1);
        print( arr );
    }
}
