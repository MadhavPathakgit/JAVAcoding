package com.company.patterns;

public class printStarPattern {
    public static void main(String[] args) {
        System.out.println("star pattern");
       for(int line = 1;line<=4;line++){
           for(int star = 1;star<=line;star++){
               System.out.print("*");
           }
           System.out.println();
       }
        System.out.println("printing inverted star pattern");
       int n= 8;
       for(int line = 1;line<=n;line++ ){
           for( int star = 1;star<=(n-line+1);star++){
               System.out.print("*");
           }
           System.out.println();
       }
        System.out.println("half pyramid pattern");
       int n1 = 5;
       for(int line = 1;line<=n1;line++){
           for(int number = 1;number<=line;number++){
               System.out.print(number);
           }
           System.out.println();
       }
        System.out.println("printing character pattern");
       int n2 = 4;
       char ch = 'A';

       for(int row = 1;row<=n2;row++){
           for(int col = 1;col<=row;col++){
               System.out.print(ch);
               ch++;
           }
           System.out.println();
       }
    }
}
