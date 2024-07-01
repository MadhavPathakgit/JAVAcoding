package arraysPractice;



public class Arraypractcie {
    public static void main( String[] args ) {
        int [] arr = {5,5,5,8,8,7,9};
        System.out.println(sum( arr ));
        System.out.println(searchingElement( arr,5 ));
        System.out.println(maxElement( arr ));
        System.out.println(SecondLargest( arr ));

    }
    public static int sum(int [] arr){
        int sum= 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];

        }
        return sum;
    }
    public static boolean searchingElement(int[] arr, int x){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }

public static  int maxElement(int[] arr){
    int max = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length;i++){
        if(arr[i]>max){
            max = arr[i];

        }
    }

    return max;
}
public static int SecondLargest(int [] arr){
        int max = maxElement( arr );
        int secondLargest = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<max && arr[i]>secondLargest){
                secondLargest = arr[i];
            }

        }
    return secondLargest;
}
}
