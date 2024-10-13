package abstractclasses;

public  class son  extends Parent{
    public  son( int age ) {
        super(age);
    }


    @Override
    void career() {
        System.out.println("i am going to be an doctor"+age);
    }

    @Override
   void partner() {
        System.out.println("i love emma watson "+age);

    }
}
