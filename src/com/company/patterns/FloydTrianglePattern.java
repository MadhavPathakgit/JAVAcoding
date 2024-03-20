package com.company.patterns;

public class FloydTrianglePattern {
    public static void floydTriangle(int rows){
        //outer loop
        int count = 1;
        for(int i = 1;i<=rows;i++){
            //inner loop
            for(int j = 1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }
    public static void zeroOneTriangle(int rows){
        for(int i =1;i<=rows;i++){
            for(int j = 1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        floydTriangle(5);
        zeroOneTriangle(5);
    }
}
