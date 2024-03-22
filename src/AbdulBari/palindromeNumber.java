package AbdulBari;

import java.util.Scanner;

public class palindromeNumber {
    public static void main( String[] args ) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number you want to find is Palindrome");
        int n = Sc.nextInt();
        int originalNo = n;
        int reverse = 0;

        while(n>0){
            int remainder = n%10;
            reverse= reverse*10+remainder;
            n = n/10;

        }
        if(originalNo==reverse){
            System.out.println("it is palindrome");
        }
        else {
            System.out.println("it is  not palindrome");

        }

    }
}
