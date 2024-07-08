package com.company.Hashmap;

import java.util.*;

public class LargestSubArrayWithZeroSum {
    public static void main( String[] args ) {
        int [] arr = {15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        int sum = 0;
        int length = 0;
        int start = 0;
        for(int j = 0;j<arr.length;j++){
            sum = sum+arr[j];
            if(map.containsKey( sum )){
                length= Math.max(length,j-map.get(sum));
                start = map.get( sum );
            }
            else{
                map.put( sum,j );
            }
        }
        for(int i =start+1;i<=length;i++){
            list.add(arr[ i]);
        }
        System.out.println(list);
        System.out.println("largest subarray with sum 0 = "+length);
    }
}
