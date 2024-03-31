package AbdulBari;

public class increasingSizeOfArray {
    public static void main( String[] args ) {
        int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 4 , 8 , 8 , 99 , 88 };
        System.out.println(arr.length);
        int[] arr2 = new int[ 2*arr.length ];
        for ( int i = 0 ; i < arr.length ; i++ ) {
            arr2[ i ] = arr[ i ];
        }
        arr = arr2;
        arr2= null;
        System.out.println(arr.length);


    }
}
