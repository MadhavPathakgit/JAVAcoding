package com.company.patterns;

public class solidRhombus {
    public static void solidRhombus(int rows){
        for(int i = 1;i<=rows;i++){
            for(int j = rows -i ;j>=1;j--){
                System.out.print(" ");
//                System.out.print("*");
            }
            for(int k = 1;k<=rows;k++){
                System.out.print("*"+" ");
            }

            System.out.println();
        }

    }
    public static void hollowRhombus(int rows){
        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows-i; j>= 1; j--)
            {
                System.out.print(" ");
            }
            for(int j= 1;j<=rows;j++){

                if(i==1|| i== rows||j==1||j==rows)
                {

                    System.out.print("*"+" ");

                }
                else{
                    System.out.print("  ");
                }
                   }
            System.out.println();

            }
        }


    public static void main(String[] args) {
//        solidRhombus(5);
        hollowRhombus(8);
    }

}
