package AbdulBari;
import java.util.*;

public class SwitchCase {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = sc.nextInt();
//
//        switch (n){
//
//            case 1:
//                System.out.println("Day is Monday");
//                break;
//            case 2:
//                System.out.println("day is Tuesday");
//                break;
//            case 3:
//                System.out.println("Day is Wednesday");
//                break;
//            case 4:
//                System.out.println("day is Thursday");
//                break;
//            case 5 :
//                System.out.println("day is Friday ");
//                break;
//            case 6:
//                System.out.println("day is Saturday");
//              break;
//            case 7:
//                System.out.println("day is Sunday");
//                break;
//            default:
//                System.out.println("Invalid Day");
//                break;
//
//        }

        //question no 2;
        System.out.println("Enter the Url of website");
        String website=sc.nextLine();
      String type =   website.substring( website.lastIndexOf(".")+1 );

      switch(type){

          case "com":
              System.out.println("the website is Of commercial Type");
              break;
          case "org":
              System.out.println("the website is Of Organization Type");
              break; case "net":
              System.out.println("the website is Of network Type");
              break; case "in":
              System.out.println("the website is from india ");
              break;
          default:
              System.out.println("This is not a website");
              break;
      }


    }
}
