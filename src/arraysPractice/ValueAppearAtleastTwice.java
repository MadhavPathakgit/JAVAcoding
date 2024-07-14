package arraysPractice;

public class ValueAppearAtleastTwice {
    public static void main( String[] args ) {
        int [] nums = { 1 , 2 , 3 , 4 ,1 };

        System.out.println(fun( nums ));
    }


    public static boolean fun(int[] nums){

        for(int i = 0;i<nums.length-1;i++){
            for(int j =i+1;j< nums.length;j++) {
                if ( nums[ i ] ==nums[ i+1] ) {
                    return true;
                }
            }
        }
        return false;
    }
    }
