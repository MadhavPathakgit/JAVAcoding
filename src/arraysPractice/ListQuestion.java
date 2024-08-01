package arraysPractice;
import java.text.CollationElementIterator;
import java.util.*;
import java.util.Collections;

public class ListQuestion {
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll( list,arr );
        for(int i = 0;i<n;i++){
            list.add(arr[i]);
        }
        System.out.println(list);

        int i =0;
        int count = 0;
        while(!list.isEmpty()){
            Integer firstElement = list.get( 0 );
            if(firstElement.equals(Collections.min(list))){
//                System.out.println( Collections.min(list));
                list.remove( 0 );
                count++;
            }
            else{

                list.remove(0);
//                System.out.println(list.get(0));
                list.add(firstElement);
                count++;
            }
        }
        System.out.println(count+"   no of operation");
    }
}
