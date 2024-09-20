package com.company.Recursionn;

public class StringLength {
    public static int Length(String str){
        if(str.equals( "" )){
            return 0;
        }

        return  1+ Length(str.substring( 1 ));


    }
    public static void main( String[] args ) {
        String str = "m12hav";
//        System.out.println(Length( str));
        int x = Character.getNumericValue( str.charAt( 1 ) );

    }
}
