package com.company.Hashmap;
import java.util.*;
public class LinkedHashmap {
    public static void main( String[] args ) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("india",100);
        lhm.put("us",50);
        lhm.put("china",150);
        System.out.println(lhm);
        TreeMap<String,Integer>  tree = new TreeMap<>();
        tree.put("india",100);
        tree.put("us",50);
        tree.put("china",150);
        System.out.println(tree);

    }
}
