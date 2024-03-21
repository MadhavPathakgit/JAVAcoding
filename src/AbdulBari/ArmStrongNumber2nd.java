package AbdulBari;

import java.util.Scanner;

public class ArmStrongNumber2nd {
    public static void main( String[] args ) {
        // USING POWER FUNCTION
        System.out.println("Enter the positive  number to find the whether it is armstrong or not");
        Scanner sc = new Scanner( System.in );
        int n = sc.nextInt();
        int originalNumber = n;

        int digits = 0;
        while(originalNumber>0){
            digits++;
            originalNumber= originalNumber/10;
        }
        originalNumber = n;
        System.out.println("the number of digits are "+digits);
        int sum = 0;
        while(originalNumber>0){
            int remainder = originalNumber%10;
            sum = sum+(int)Math.pow( remainder,digits );
            originalNumber=    originalNumber/10;


        }

        if(n==sum){
            System.out.println("is armstrong");
        }
        else{
            System.out.println("not a armstrong number");
        }
    }
}
