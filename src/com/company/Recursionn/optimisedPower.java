package com.company.Recursionn;

public class optimisedPower {
    public static int opPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            return opPower( x,n/2 )*opPower( x,n/2 );
        }
        return  x*opPower( x,n/2 )*opPower( x,n/2 );

    }
    public static void main( String[] args ) {
        System.out.println(opPower( 2,5 ));

    }
}
