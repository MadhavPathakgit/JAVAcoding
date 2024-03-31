package com.company.patterns;

public class diamondPattern {
    public static void diamond(int rows){
        for(int i = 1;i<=rows;i++)
        {
            for (int j = rows-i; j>= 1; j--) {
                System.out.print("   ");
            }
                for(int j= 1;j<= (2*i)-1;j++){
                System.out.print("*  ");
            }

            System.out.println();

        } 
        //2nd half
//        for(int i = rows;i>=1;i--)
//        {
//            for (int j = rows-i; j>= 1; j--) {
//                System.out.print("   ");
//            }
//                for(int j= 1;j<= (2*i)-1;j++){
//                System.out.print("*  ");
//            }
//
//            System.out.println();
//
//        }
//
    }
    public static void main(String[] args) {
        diamond(4);

    }
}
