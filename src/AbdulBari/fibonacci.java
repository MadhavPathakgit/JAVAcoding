package AbdulBari;

import java.util.Scanner;

public class fibonacci {
    public static void main( String[] args ) {
        System.out.println("Program for Fibonacci Series");
        System.out.println();
        //fibonacciSeries using loop
        System.out.println("Enter the number till you want to print th series");
        Scanner sc = new Scanner( System.in );
        int n =  sc.nextInt();
        int a = 0; int b = 1;
        System.out.print(a+" , ");
        System.out.print(b+" , ");

        for(int i = 0;i<n-2;i++){
           int c = a+b;
            System.out.print(c +" , ");
            a=b;
            b=c;
        }
    }
}
