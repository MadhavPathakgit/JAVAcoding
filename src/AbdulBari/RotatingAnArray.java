package AbdulBari;

public class RotatingAnArray {
    public static void main( String[] args ) {
         int [] arr = {5,9,6,10,2,7,3,5,4,2};
         //Left Rotating an array;
        int temp = arr[0];

        for(int i = 1;i< arr.length;i++) {
            arr[ i-1] = arr[ i ];
        }
        arr[ arr.length-1]= temp;

        for ( int j : arr ) {
            System.out.print( j + " " );

        }
    }
}
