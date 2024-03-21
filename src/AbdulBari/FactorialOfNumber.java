package AbdulBari;
import java.util.*;

public class FactorialOfNumber {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find the factorial");
        int n = sc.nextInt();
        int factorial = 1;
        for(int i =1;i<=n;i++){
            factorial *= i;

        }
        System.out.println("The factorial is : "+factorial);
    }
}
