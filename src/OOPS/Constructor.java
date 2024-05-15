package OOPS;
class Rectangle2{
    private double length;
    private double breadth;
    public Rectangle2(){
        //non parametarized constructor
        length = 1;
        breadth = 1;
    }
    public Rectangle2(double l, double b){
       length = l;
       breadth = b;
    }
    public Rectangle2(double s){
       length = breadth = s;
    }
    public double area(){
        return length*breadth;
    }
    public double parameter(){
        return 2*(length+breadth);
    }
}

public class Constructor {
    public static void main( String[] args ) {
        Rectangle2  r1 = new Rectangle2(4,5);
//        Rectangle2  r1 = new Rectangle2();
//        Rectangle2  r1 = new Rectangle2(4);

        System.out.println(r1.area());
        System.out.println((r1.parameter()));

    }
}
