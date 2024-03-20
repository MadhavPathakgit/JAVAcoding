package AbdulBari;
import java.util.*;

public class RAdixOfaNumber {
    public static void main( String[] args ) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        if(number.matches("[01]+")){
            System.out.println("Binary Radix = 2 ");
        }
        else if(number.matches("[0-7]+")){
            System.out.println("octal  Radix = 7");
        }
        else if(number.matches("[0-9]+")){
            System.out.println("decimal Radix = 10");
        }
        else if(number.matches( "[0-9A-F]+" )){
            System.out.println("hexadecimal Radix = 16");
        }

        else{
            System.out.println("Not A Number");
        }

    }
}
