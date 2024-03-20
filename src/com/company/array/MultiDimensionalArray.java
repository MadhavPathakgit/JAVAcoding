package com.company.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][]flats;
        flats =new  int  [2][3];
        flats[0][0]= 100;
        flats[0][1]= 200;
        flats[0][2]= 300;
        flats[1][0]= 400;
        flats[1][1]= 500;
        flats[1][2]= 600;
        for(int i = 0;i<flats.length;i++){
            for(int j = 0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print (" ");
            }
            System.out.println("\n");
        }





   }
}
