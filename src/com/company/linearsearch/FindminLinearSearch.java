package com.company.linearsearch;

public class FindminLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,24,2,5,4,5,4,5,5,585,};
        System.out.println(min(arr));

    }
    // assume arr.length1= 0;
    static int min(int[] arr){
        int ans = arr[0];

        for(int i = 0;i< arr.length;i++) {
         if(arr[i]<ans){
             ans = arr[i];

         }


        }
        return ans;

        }



}
