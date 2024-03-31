package AbdulBari;

public class ReverseCopyingArray {
    public static void main( String[] args ) {
        int [] arr = {44,5,8,4,4,5,5,7};
        int[] b = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1;i>=0;i--){
            b[j] = arr[ i ];
            j++;

        }
        for(int k:b){
            System.out.println(k);
        }

    }
}
