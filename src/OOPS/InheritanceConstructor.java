package OOPS;
class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");    }
}
class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild Constructor");
    }
}

public class InheritanceConstructor {
    public static void main( String[] args ) {
GrandChild c = new GrandChild();
// when you create a constructor
// of  child class then the constructor
// of parent class is executed first.

    }
}
