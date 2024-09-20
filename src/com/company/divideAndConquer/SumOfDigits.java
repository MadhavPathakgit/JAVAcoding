package com.company.divideAndConquer;

public class SumOfDigits {
    public static void main( String[] args ) {
        int n = 132744;
        int rev = 0;
        System.out.println(sumofdigits(n));
        System.out.println(reverse( n,rev ));
    }
    public static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        int rem = n%10;
    return reverse( n/10 ,rev*10+rem);
    }
    public static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumofdigits( n/10 );
    }
}
