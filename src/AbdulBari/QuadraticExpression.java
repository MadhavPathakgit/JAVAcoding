package AbdulBari;

import java.util.Scanner;

public class QuadraticExpression {
    public static void main( String[] args ) {
        int a,b,c;
        double r1,r2;

        System.out.println("enter the value of coefficient of quadratic equation");
        Scanner sc = new Scanner( System.in );
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        r1 = (-b+ Math.sqrt( (b*b) - (4*a*c) ))/(2*a);
        r2 = (-b- Math.sqrt( (b*b) - (4*a*c)))/(2*a);
        System.out.println( "Root are "+r1+ " & "+ r2);
//        System.out.println(r2);

    }
}
