package OOPS;
class Super{
    public void display(){
        System.out.println("Super Class Display");
    }
}
class Sub extends Super{
    
    public void display(int x){
        System.out.println("Sub Class Display");
    }
}

public class overRidingMethod {
    public static void main( String[] args ) {
        Super sup = new Super();
        sup.display();
        Sub s = new Sub();
        s.display();


    }
}
