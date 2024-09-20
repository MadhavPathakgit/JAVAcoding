package com.company.Hashmap;

import java.util.HashMap;

public class IndexOcurrencesEqualsIndexValue {
    public static void main( String[] args ) {
        String str = "1210";
        HashMap<Integer,Integer>  map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
            int x = Character.getNumericValue( str.charAt( i ) );

            map.put(x, map.getOrDefault(x,0) +1);
        }
        boolean isValid = true;
        for(int i = 0;i<str.length();i++){
            int x = Character.getNumericValue( str.charAt( i ) );
            if(map.getOrDefault( i,0)!=x){
                isValid = false;
                break;
            }

        }


    // Output the result
        if (isValid) {
        System.out.println(1);
    }
        else {
        System.out.println(0);
    }


    }
}
