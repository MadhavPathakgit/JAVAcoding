package com.company.Bit;



public class getIBit {
    public static void main( String[] args ) {
        System.out.println(getBitt(     10,3));
        System.out.println(SetBit( 10,2 ));
        System.out.println(clearBitIth( 10,1 ));
        System.out.println(Update( 10,2,1));
        System.out.println(clearIthBit( 7,2 ));
        System.out.println(clearInRange( 10,2,4 ));
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
    public static int clearBitIth(int n,int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }
    public static int Update(int n , int i,int newBit){
//        if(newBit==0){
//            return clearBitIth( n,i );
//
//        }
//        else{
//            return SetBit( n,i );
//        }
        n =  clearBitIth( n,i );
        int BitMAsk = newBit<<i;
        return n | BitMAsk;

    }
    public static int clearIthBit(int n,int i){
        int bitMask = (~0)<<i;
        return n&bitMask;
    }
    public static  int clearInRange(int n,int i,int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
    }
}
