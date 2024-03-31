package AbdulBari;

import java.util.Scanner;

public class InsertingElementInArray {
    public static void main( String[] args ) {
        //insert element at an index;

        int [] arr = new int[10];
        arr[0]= 1;
        arr[1]=2;
        arr[2]= 3;
        arr[3]= 4;
        arr[4]= 4;
        arr[5]= 4;
        arr[6]= 4;
        int n = 0;
        int k = 0;
        while(arr[k]!=0){
            n++;
            k++;
        }

//        System.out.println(n);
        System.out.println("enter the index you want to enter the element");
        Scanner sc = new Scanner( System.in );
        int index = sc.nextInt();
        System.out.println("enter the element you want to enter");
        int element = sc.nextInt();
        for(int i =n-1;i>index;i--){
            arr[i]= arr[i-1];
        }
       arr[index] = element;
        for ( int j : arr ) {
            System.out.print( j + " " );
        }
    }
}
