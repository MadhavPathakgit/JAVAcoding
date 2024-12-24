package InterFaces;

public class ExcepetionHandling {
    public static void main( String[] args ) {
        int a = 5;
        int b = 0;
        try {

            divide( a , b );
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        } finally {
            System.out.println( "it always execute " );
        }
    }


static int divide ( int a , int b) throws ArithmeticException{
    if(b==0){
        throw new ArithmeticException("please do d not divide it by Zero");

    }
    return a/b;
}
}