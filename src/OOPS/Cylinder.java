package OOPS;



class cylinder2{
    private double radius;
    private double height;

    public cylinder2() {
        setRadius( 2 );
        setHeight( 4 );
    }

    public double getRadius(){
        return radius;

    }
    public double getHeight(){
        return height;
    }
    public void setRadius(double r){
        radius  = r;
    }
    public void setHeight(double h){
        height = h;
    }


    public cylinder2(double r, double h){
     setRadius(r  );
      setHeight( h );
    }
    public cylinder2(double s){
        radius = height = s;

    }
  public double Area(){
        return 2* Math.PI*getRadius()*(getRadius()+getHeight());

  }

}
public class Cylinder {
    public static void main( String[] args ) {
        cylinder2  c4 = new cylinder2( 10,20 );
        System.out.println(c4.Area());
    }



}
