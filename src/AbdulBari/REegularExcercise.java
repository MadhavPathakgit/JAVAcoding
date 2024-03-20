package AbdulBari;
import java.util.*;

public class REegularExcercise {
    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your  gmail id");
//        String str = sc.nextLine();
//        String str2 = "gmail";
//        System.out.println(" the id you enter is gmail id:"+str.matches( "\\w*@gmail(.*)" ));
//        int endOfUsername = str.indexOf( '@');
//        int dotIndex= str.indexOf( '.' );
//        String Username = str.substring( 0,endOfUsername );
//        System.out.println("The username of your gmail id is: "+Username);
//        String Domain = str.substring( endOfUsername+1 );
//        System.out.println("The Domain name of your id is: "+Domain);
//        String GmailOrNot = str.substring( endOfUsername+1,dotIndex );
//        System.out.println(str2.equals( GmailOrNot ));
        // remove Special characters from a string
        String str3 = "a!B@c#1$2%3";
//
        System.out.println(str3.replaceAll( "[^a-zA-Z0-9]","" ));
        // to remove the spaces from given string
        String str4 = "   abc def   gfhf   jjik   ";
        System.out.println(str4.replaceAll("\\s","").trim());
        // to find the number of words in a string
        String str5 = "abc def ghi jkl mno pqr";
       String [] words= str5.split("\\s");
        System.out.println(words.length);





    }
}
