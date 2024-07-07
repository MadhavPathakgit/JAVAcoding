package com.company.Hashmap;
import java.util.*;

public class HashMapPut {
    public static void main( String[] args ) {
        // Create
        HashMap<String,Integer> hm = new HashMap<>();
        //Insert-O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm);
        //Get-O(1)
        int population = hm.get("India");
        // to get the value of a key;

        System.out.println(population);
        //Contains Key-O(1)
        System.out.println(hm.containsKey( "India" ));
        System.out.println(hm.containsKey( "Indiana" ));
        //Remove-O(1)
        System.out.println(hm.remove( "China" ));
//        delete the node and return value of the key
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm);


    }
}
