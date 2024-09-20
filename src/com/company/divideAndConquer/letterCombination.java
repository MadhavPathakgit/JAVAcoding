package com.company.divideAndConquer;

import java.util.ArrayList;

public class letterCombination {
    public static void main( String[] args ) {
        letter(  "","12");
    }
    public static void letter(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt( 0 )-'0';
        for(int i = (digit-1)*3;i<digit*3;i++){
           char ch = (char)('a'+i);
           letter(p+ch,up.substring( 1 ));
        }

    }
    public static ArrayList<String>letter2( String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        int digit = up.charAt( 0 )-'0';
        for(int i = (digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
           list.addAll(   letter2(p+ch, up.substring( 1 )));
        }
        return list;

    }

}
