package loopPractice;
import java.util.*;


public class SumOfOddDigitsInANumber {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int digit = n%10;
            if(isOdd(digit)){
                sum = sum+digit;
            }
            n = n/10;

        }
        System.out.println("the sum is "+ sum);


    }
    public static boolean isOdd(int n){
        if(n%2!=0){
            return true;
        }
        return false;

    }
}
