package com.company.Hashmap;
import java.util.*;


public class CountDistincElement {
    public static void main( String[] args ) {

        int[] num = { 4 , 3 , 2 , 5 , 6 , 9 , 7 , 3 , 4 , 2 , 1 };
//    HashMap<Integer,Integer> map = new HashMap<>();
//    for(int i =0;i<num.length;i++){
//     map.put(num[i],map.getOrDefault( num[i],0 )+1);
//    }
////    for(int key:map.keySet()){
////        if(map.get(key )>=1){
////            System.out.println(key);
////        }
//        System.out.println(map.size());
//    }
//
        HashSet<Integer> set = new HashSet<>();
        for ( int i = 0 ; i < num.length ; i++ ) {
            set.add( num[ i ] );
        }
        System.out.println( "ans=" + set.size() );
    }
}