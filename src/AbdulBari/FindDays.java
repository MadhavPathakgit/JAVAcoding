package AbdulBari;
import java.util.*;

public class FindDays {
    public static void main( String[] args ) {
Scanner sc = new Scanner( System.in );

        System.out.println( "Enter the number" );
        int n = sc.nextInt();

        switch (n) {
            case 1 -> System.out.println( "Day is Monday" );
            case 2 -> System.out.println( "day is Tuesday" );
            case 3 -> System.out.println( "Day is Wednesday" );
            case 4 -> System.out.println( "day is Thursday" );
            case 5 -> System.out.println( "day is Friday " );
            case 6 -> System.out.println( "day is Saturday" );
            case 7 -> System.out.println( "day is Sunday" );
            default -> System.out.println( "Invalid Day" );
        }
    }
}
