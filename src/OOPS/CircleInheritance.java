package OOPS;
class Circle23{
    public double radius;
    public double area(){
        return Math.PI*radius*radius;
    }
    public double perimeter(){
        return  Math.PI*2*radius;
    }

}
class Cylinder23 extends Circle23{
    public double height;
    public double volume(){
           return area()*height;
    }


}

public class CircleInheritance {
    public static void main( String[] args ) {
  Cylinder23 c4  = new Cylinder23();
        c4.radius=7;
        c4.height=10;
        System.out.println(c4.volume());
        System.out.println(c4.area());


    }
}
