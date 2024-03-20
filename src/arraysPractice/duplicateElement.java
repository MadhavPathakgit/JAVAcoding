package arraysPractice;

public class duplicateElement {
    public static void main( String[] args ) {
        int []arr = {1,2,3,4,5,6,7,8,8,8,9};
        int count = 0;
//        int length = arr.length;
        for(int i = 0;i< arr.length;i++){
            for(int j = 1;j< arr.length;j++){
                if(arr[i]== arr[ j ]){
                    count++;

                }

            }
        }
        if(count== 0){
            System.out.println("no duplicate element is found");
        }
        else{
            System.out.println(" duplicate element is found");
        }
    }
}
