package arraysPractice;

public class Arrayrotation {
    public static void main( String[] args ) {
        int[] arr = new int[40];
        arr[0] = 4;
        arr[1]= 3;
        arr[2] = 4;
        arr[3] = 6;
        int n = 4;

        int[] ans = deletionFromIndex( arr,1,4 );
        for ( int x : ans ) {
            System.out.print( x );
        }

    }

    public static int[] leftRotation( int[] arr ) {
        int temp = arr[ 0 ];
        for ( int i = 1 ; i < arr.length ; i++ ) {
            arr[ i - 1 ] = arr[ i ];
        }
        arr[ arr.length - 1 ] = temp;
        return arr;
    }


    public static int[] rightRotation( int[] arr ) {
        int temp = arr[ arr.length - 1 ];
        for ( int i =  arr.length-1;i>=1 ;i-- ) {
            arr[ i ] = arr[ i -1];
        }
        arr[ 0 ] = temp;
        return arr;
    }
    public static int[] deletionFromIndex(int[] arr,int  index, int element){
        for(int i = index+1;i<=element;i++){
            arr[i-1]= arr[i];

        }
            return arr;
    }
}
