package AbdulBari;

import java.util.Scanner;

public class AirthmeticProgression {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter first Term:");
        int a = sc.nextInt();
        System.out.println("Enter common difference:");
        int d = sc.nextInt();
        System.out.println("Enter the number from which you want to print the series:");
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.print(a+" ");
            a = a+d;

        }

    }

}
