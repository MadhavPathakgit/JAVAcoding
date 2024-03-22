package AbdulBari;
import java.util.*;
public class DisplayNumberWithTailingZero {
    //Display a number with tailing zero also
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to display it in words");
        int n = sc.nextInt();
        String str = new String();
        int originalNumber = n;
        int reverse = 0;
        while ( n>0 ){
            int rem = n%10;
            n = n/10;
            str = str+rem;

        }
//        System.out.println(str);
        for(int i = str.length()-1;i>=0;i--){
            char digit = str.charAt( i );
//            System.out.println(digit);

            switch(digit){
                case '0':
                    System.out.print(" zero ");
                    break;
                case '1':
                    System.out.print(" one ");
                    break;
                case '2':
                    System.out.print(" two ");
                    break;
                case '3':
                    System.out.print(" three ");
                    break;
                case '4':
                    System.out.print(" four ");
                    break;
                case '5':
                    System.out.print(" five ");
                    break;
                case '6':
                    System.out.print(" six ");
                    break;
                case '7':
                    System.out.print(" seven ");
                    break;
                case '8':
                    System.out.print(" eight ");
                    break;
                case '9':
                    System.out.print(" nine ");
                    break;
                default:
                    System.out.print("invalid number");
                    break;
            }
            }
        }

    }

