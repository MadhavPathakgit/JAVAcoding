package AbdulBari;

public class Array2D {
    public static void main( String[] args ) {
//        int []E,F[];
//        E = new int[5];
//        F = new int[5][5]; // f is a 2d array

         int [][]B = {{1,2,3},{2,3,6},{4,5,6}};
        for ( int[] x : B ) {
            for ( int j :x ) {
                System.out.print( j + " " );
            }
            System.out.println();
        }

    }
}
