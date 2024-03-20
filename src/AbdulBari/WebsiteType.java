package AbdulBari;
import java.util.*;

public class WebsiteType {

public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your website url");
    String website = sc.nextLine();
//    http://www.google.com

   String protocol = website.substring(0, website.indexOf(":"));

    if( protocol.equals("http")){
        System.out.println("the protocol is:Hyper Text Transfer Protocol");
    }
    else if(protocol.equals("ftp")){
        System.out.println("The Protocol is: File Transfer Protocol");

    }

    String WebsiteTyped = website.substring(website.lastIndexOf(".")+1);
if(WebsiteTyped.equals("com")){
    System.out.println("this is a commercial Website");
}
else if(WebsiteTyped.equals("org")){
        System.out.println("this is a organization Website");
    }




}

}
