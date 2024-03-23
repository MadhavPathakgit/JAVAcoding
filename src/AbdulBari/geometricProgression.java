package AbdulBari;

import java.util.Scanner;

public class geometricProgression {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter first Term:");
        int a = sc.nextInt();
        System.out.println("Enter common ratio:");
        int r = sc.nextInt();
        System.out.println("Enter the number from which you want to print the series:");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.print(a+"  ");
            a = a*r;

        }
    }
}
