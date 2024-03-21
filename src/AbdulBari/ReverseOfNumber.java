package AbdulBari;
import java.util.*;

public class ReverseOfNumber {
    public static void main( String[] args ) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number you want to find the Reverse");
        int n = Sc.nextInt();
        int reverse = 0;

        while(n>0){
            int remainder = n%10;
        reverse= reverse*10+remainder;
        n = n/10;

        }
        System.out.println(reverse);

    }
}
