package loopPractice;
import java.util.*;

public class SumOfSquare {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int SumSquare = 0;
        while(n>0){
            int digit = n%10;
            SumSquare = SumSquare+(int)Math.pow( digit,p);
            n = n/10;

        }
        System.out.println(SumSquare);
    }
}
