package com.company.patterns;

public class invertedHalfPyramidPattern {
    public static void invertedHalfPyramidPattern(int rows){
        //outer loop
        for(int i = 1;i<=rows;i++) {
            //spaces

            for (int j = 1; j <= rows-i; j++) {

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//    } public static void PatternWithNumbers(int n){
//        for(int i =1;i<=n;i++){
//            for(int j = 1;j<=n-i+1;j++){
//                System.out.print(j+" ");
//
//            }
//            System.out.println();
//        }

    }

    public static void main(String[] args) {
      invertedHalfPyramidPattern(10);
//       PatternWithNumbers(5);

    }
}
