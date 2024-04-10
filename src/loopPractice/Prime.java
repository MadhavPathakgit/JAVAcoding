package loopPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Prime {
    public static void main( String[] args ) {
        Scanner sc = new Scanner( System.in );
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int flag = 0;
        for(int j = n1 ; j <= n2 ; j++) {
            flag = 0;
            for ( int i = 1 ; i <= j ; i++ ) {
                if ( j % i == 0 ) {
                    flag++;
                }
            }
            if(flag == 2 || j == 2) {
                System.out.println(j + " : Number is prime");
            }
        }

    }
}
