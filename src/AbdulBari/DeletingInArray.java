package AbdulBari;
import java.util.*;

public class DeletingInArray {
    public static void main( String[] args ) {
        int [] arr = new int[10];
        arr[0]= 1;
        arr[1]=2;
        arr[2]= 3;
        arr[3]= 4;
        arr[4]= 4;
        arr[5]= 4;
        arr[6]= 4;
        int n = 0;

        while ( arr[ n ] != 0 ) {
            n++;
//
        }
        System.out.println(n);
        System.out.println("Enter the index of element you want to delete");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
      for(int i = index;i<n;i++){
          arr[i]= arr[i+1];

      }
      for(int j:arr){
          System.out.print(j);
      }
    }
}
