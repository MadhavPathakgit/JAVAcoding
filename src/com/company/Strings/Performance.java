package com.company.Strings;

public class Performance {
    public static void main( String[] args ) {
        String series = "";
        for(int i =0;i<26;i++){
            char ch = (char)('a'+i);
            series = series + ch;
            // new String object every time ......
            // So much memory wastage;.............
//  time complexity of O(n2);
//            System.out.println(ch);
        }
        System.out.println(series);
    }
        }
