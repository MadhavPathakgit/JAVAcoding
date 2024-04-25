package com.company.Bit;

public class getIBit {
    public static void main( String[] args ) {
        System.out.println(getBitt( 10,3));
        System.out.println(SetBit( 10,2 ));
    }
    public static int getBitt(int n,int i){
        int bitMask = 1<<i;
         if((n&bitMask)==0){
             return 0;
         }
         else{
             return 1;
         }
    }
    public static int SetBit(int n,int i){
        int BitMask = 1<<i;
      return n|BitMask;
    }
}
