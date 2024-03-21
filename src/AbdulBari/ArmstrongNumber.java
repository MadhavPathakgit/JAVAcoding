package AbdulBari;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main( String[] args ) {
        //this is made wthout using power method
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
        System.out.println(digits);
        int sum = 0;
        while(originalNumber>0){
            int remainder = originalNumber%10;
            int power = remainder;
            for(int i = 1;i<digits;i++){
                power = power*remainder;}



            sum = sum+power;
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
