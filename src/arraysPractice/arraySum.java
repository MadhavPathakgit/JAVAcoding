package arraysPractice;

import java.util.Arrays;

public class arraySum {
    public static int Sum(int []array){
        int sum = 0;
        for(int i = 0;i<array.length;i++){
            sum = sum+array[ i ];
        }
      return sum;
    }
    public static float Average(int[] array){
        float sum = 0;
        float  average = 0;

        for(int i = 0;i<array.length;i++){
            sum = sum+array[ i ];
          average = sum / (array.length);

        }
        return average;
    }
    public static int LargestElement(int []array){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<array.length;i++) {
          if(max<array[i]){
              max = array[ i ];
          }
        }
        return max;
    }
    public static int SmallestElement(int []array){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<array.length;i++) {
            if(min>array[i]){
                min= array[ i ];
            }
        }
        return min;
    }
    public static void Reverse(int [] array){
        int start = 0 ;
        int end =array.length -1;
        int temp ;
        for(int i = 0;i< array.length/2;i++){
            temp = array[ start ];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }

        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]);

        }

    }
    public static void Sorting( int[] array){
        Arrays.sort( array );
        for(int i =0;i< array.length;i++){
            System.out.print(array[i]);
        }
    }



    public static void main( String[] args ) {

     int[] array = {1,2,4,7,8,9,8,9,85,6};
//        int sum = Sum( array );
//        System.out.println(sum);
//        float  average = Average( array );
//        System.out.println(average);
//        int max = LargestElement( array );
//        System.out.println(max);
//        int min = SmallestElement( array );
//        System.out.println(min);
//        Reverse( array );

   Sorting( array );



    }
}
