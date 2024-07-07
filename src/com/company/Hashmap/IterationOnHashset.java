package com.company.Hashmap;
import java.util.*;


public class IterationOnHashset {
    public static void main( String[] args ) {
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("kolkatta");
        cities.add("jaipur");
        cities.add("mathura");
//        Iterator it = cities.iterator();
//        while( it.hasNext() ){
//            System.out.println(it.next());
//        }
        for(String city:cities){
            System.out.println(city);
        }
    }
}
