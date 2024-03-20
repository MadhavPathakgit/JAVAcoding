package com.company.patterns;

public class patternsAdvances {
    public static void main( String[] args ) {
//NumberPyramid( 5 );
        PalindromicPAttern( 5 );
        pattern( 5 );
    }
    public static void PalindromicPAttern(int n){
        for(int i = 1;i<=n;i++){
            //for  spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for descending numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //for ascending number
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void NumberPyramid(int n){
        for(int i = 1;i<=n;i++){
            // spaces
            for(int j= 1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");

            }
            System.out.println();
        }
    }
    public static void pattern(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<n;i++ ){
            for(int j = 1;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
