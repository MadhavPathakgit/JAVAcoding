package AbdulBari;
import java.util.*;
public class DisplayDigits {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number you want to display the Digits of the numbers");
        int n = sc.nextInt();

        while(n>0){
            int remainder= n%10;
            System.out.println("The digits of numbers are: "+remainder);
            n= n/10;

        }
    }
}
