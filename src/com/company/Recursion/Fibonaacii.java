package com.company.Recursion;

public class Fibonaacii {
    public static void main( String[] args ) {
        int n = 7  ;
for(int i = 0;i<=n;i++){
        System.out.println(fibo( i));}
    }
    static int fibo(int n){
//        if ( n== 0  ){
//            return 0;
//        }
//        if ( n== 1  ){
//            return 1;
//        }
// instead of this we can  put base condition as
        if(n<2){
            return n;
        }
        return fibo( n-1 )+fibo( n-2 );
    }
}
