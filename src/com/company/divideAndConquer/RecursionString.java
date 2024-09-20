package com.company.divideAndConquer;

public class RecursionString {
    public static void main( String[] args ) {
        String str = "bcaccad";
        String ans = "";
//        ans += 'b';
//        ans = 'c'+ans;
//        System.out.println(ans);
//        Stream( str,ans );
        System.out.println(  Stream2( str ));

    }
    // passing strings as an argument approach
//    public static void   Stream(String str,String ans){
//        if(str.isEmpty()){
//            System.out.println(ans);
//            return;
//        }
//        if(str.charAt( 0 )=='a'){
//            Stream(str.substring(1  ) ,ans);
//        }
//        else {
//            Stream( str.substring( 1 ) , ans + str.charAt( 0 ) );
//        }
//
//    }
    public static String  Stream2(String str){
        if(str.isEmpty()){

            return "";
        }
        if(str.charAt( 0 )=='a'){
         return    Stream2(str.substring(1  ) );
        }
        else {
            return  str.charAt( 0 )+ Stream2( str.substring( 1 )  );
        }

    }
}
