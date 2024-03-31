package com.company.patterns;

public class SecondLargestElement {
    public static void main( String[] args ) {
        int [] arr= {1,2,3,4,5,6,5,8,9,1,0};
        int largest= arr[0];
        int SecondLargest= arr[0];
        for(int i =0;i< arr.length;i++){
            if(largest<arr[ i ]){
                SecondLargest= largest;
                largest= arr[ i ];}
            else if(SecondLargest<arr[i]){
                SecondLargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(SecondLargest);

    }
}
