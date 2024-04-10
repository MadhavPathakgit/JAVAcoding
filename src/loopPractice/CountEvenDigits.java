package loopPractice;
import java.util.*;

public class CountEvenDigits {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        int count =0;
        while(n>0){
            int digit = n%10;
            if(isEven(digit)){
                count++;
            }
            n = n/10;
        }
        System.out.println( count);
    }
    public static boolean isEven( int n){
        if(n%2==0){
            return true;
        }
        return false;
    }


}
