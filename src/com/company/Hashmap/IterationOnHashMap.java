package com.company.Hashmap;

import java.util.*;

public class IterationOnHashMap {
    public static void main( String[] args ) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("India",100);
        map.put("China",150);
        map.put("US",50);
      map.put("Indonesia",6);
      map.put("Nepal",5);
      // Iterate
        //entrySet()
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String k: keys){
            System.out.println("key="+k+"," + "value="+map.get(k));

        }



    }
}
