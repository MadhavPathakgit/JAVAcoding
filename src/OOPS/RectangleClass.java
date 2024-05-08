package OOPS;
class Rectangle{
//    public double length;
//    public double breadth;
    private double length;
    private double breadth;
    public double area(){
        return length* breadth;
    }
    public double parameter(){
        return 2*(length+breadth);

    }
    public double getLength(){
        return length;

    }
    public double getbreadth(){
        return breadth;

    }
    public void setLength(double l){
        // it cn also validate the value of length
        if(l>0){
         length = l;}
        else{
            length = 0;
        }
    }
    public void setBreadth(double b){
        if(b>0){
        breadth = b;
        }
        else{
            breadth = 0;
        }
    }

}

public class RectangleClass {
    public static void main( String[] args ) {
        Rectangle r1 = new Rectangle();
       r1.setLength( -10.5 );
       r1.setBreadth( 5.5 );
        System.out.println(r1.area());
        System.out.println(r1.parameter());
        System.out.println(r1.getLength());
        System.out.println(r1.getbreadth());

    }
}
