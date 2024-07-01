package OOPS;


class Parent1{
    int x = 10;
    Parent1(){
        System.out.println("Non-Param of Parent");

    }
    Parent1(int x){
        System.out.println("Param of Parent "+ x);
    }}
class Child1 extends Parent1{
    Child1(){
        System.out.println("Non -Param of Child");
    }
    int x = 20;
    Child1(int y){
        System.out.println("Param of Child");

    }
    Child1(int x , int y){
        super(x); // keyword for parameterized constructor of parent
        System.out.println("2 param of Child "+ y);
        System.out.println(super.x);
        System.out.println(x);
    }
}


public class superCONSTRUCTOR {
    public static void main( String[] args ) {
Child1 c = new Child1(20,40);


    }
}
