package com.company.Strings;

import java.util.ArrayList;

public class Operators {
    public static void main( String[] args ) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a"+ 1);
        System.out.println("kunal"+ new ArrayList<>());
//        System.out.println(new ArrayList<>()+56);
//        upper line shows error because oth are object
        // this is same as after a few steps: "a"+"1";
       // toString() method will convert object like
        // num and arraylist
        // into string ans simply add it with another String
        // integer will be converted to Integer that will call toString();

    }
}
