package loopPractice;
import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check :");
        int n= sc.nextInt();
        int copy = n;
        int reverse = 0;
        while(n>0){
            int digit = n%10;
            reverse = reverse*10+digit;
            n = n/10;

        }
        if(copy==reverse){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("is not palindrome");
        }


    }
}
