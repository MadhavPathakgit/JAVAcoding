package arraysPractice;

public class MaxSubArraySum {
    public static void main( String[] args ) {
        int[] arr = {-2,4,-6,8,-10};
        int maxSum=0;
        int currSum =0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                for(int k = i;k<=j;k++){
                    currSum = currSum+arr[ k ];
                    maxSum = Math.max(maxSum,currSum);
                }
                currSum=0;
            }
        }
        System.out.println(maxSum);

    }
}
