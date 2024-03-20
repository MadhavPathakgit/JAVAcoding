package AbdulBari;
import java.util.*;

public class readKeyboard {
    public static void main( String[] args ) {

        System.out.println(" enter the value of sides of triangles");
         Scanner sc = new Scanner(System.in);
         float a = sc.nextFloat();
         float b = sc.nextFloat();
         float c = sc.nextFloat();
         float s = (a+b+c)/2;
        System.out.println(s);
        double area = (float) Math.sqrt(  s*(s-a)*(s-b)*(s-c));
        System.out.println(area);


        System.out.println();
    }
}
