package com.company.Recursionn;

public class optimisedPower {
    public static int opPower(int x, int n){
//        O(logn);
        if(n==0){
            return 1;
        }
        int half = opPower( x,n/2 );
        if(n%2==0){
            return half*half;
        }
        return x*half*half;
    }
    public static void main( String[] args ) {
        System.out.println(opPower( 2,10));

    }
}
