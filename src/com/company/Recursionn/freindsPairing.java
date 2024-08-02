package com.company.Recursionn;

public class freindsPairing {
    public static int friendssPairing(int n){
        if (n == 1 || n == 2) {
            return n;
        }
        int fnm1 = friendssPairing(n-1);
        int fnm2 = friendssPairing(n-2);
        int pairWays = (n-1) * fnm2;
        int totWays = fnm1 + pairWays;
return totWays;
    }
    public static void main( String[] args ) {
        int n = 3;
        System.out.println(friendssPairing(  n));
    }
}
