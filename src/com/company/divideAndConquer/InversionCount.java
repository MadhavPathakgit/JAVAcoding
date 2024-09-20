package com.company.divideAndConquer;

public class InversionCount {
//    Inversion Count: For an array, inversion count indicates how far (or close) the array is from
//    being sorted. If the array is already sorted then the inversion count is 0. If an array is
//    sorted in the reverse order then the inversion count is the maximum.
//    Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j
    public static  int CountInvesion(int[] arr){
        int count = 0;
        for ( int i = 0;i<arr.length-1;i++){
            for(int j= i+1;j< arr.length;j++){
                if(arr[i]>arr[j] ){
                    count++;
                }
            }
        }
        return count;
    }
public static void main( String[] args ) {
    int[] arr = {5,5,5};
    System.out.println(CountInvesion( arr ));

}
}
