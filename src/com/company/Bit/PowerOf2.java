package com.company.Bit;

public class PowerOf2 {
    public static void main( String[] args ) {
        // power of 2 or not
        System.out.println(isPowerOf2( 256 ));

    }
    public static boolean isPowerOf2(int n){
        if((n&(n-1))==0){
            return  true;
        }
        return false;
    }
}
