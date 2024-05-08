package OOPS;

class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double paramter() {
        return Math.PI * 2 * radius;
    }
}

public class classFormation {


    public static void main( String[] args ) {
        Circle c1 = new Circle();
        c1.radius = 7;

        System.out.println( "area  : " + c1.area() );
        System.out.println( "paramter :" + c1.paramter() );


    }
}
