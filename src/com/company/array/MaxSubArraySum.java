package com.company.array;

public class MaxSubArraySum {
    // brute force approach
    public static void main( String[] args ) {

        int [] arr = {-5,1,2,-1};
//        SubArraySum2( arr );
        System.out.println(kadanes( arr ));
    }

    //kadanes algorithm
    public static int  kadanes(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int cs = 0;
        int max_ele = Integer.MIN_VALUE;

//      int smallest = Integer.MAX_VALUE;


      for(int i= 0;i< arr.length;i++){
//          if(arr[i]>max){
//              max = arr[i];
//          }
          max_ele = Math.max( max_ele,arr[i] );
          cs+= arr[ i ];
          if(cs<0){
              cs = 0;
          }
//          max = Math.max(cs,max);
          if ( cs > max ) {
              max = cs;
          }
      }
      if(cs == 0) {
          return  max_ele;
      } else {
          return  max;
      }
        //System.out.println(max);
    }



    static void SubArraySum( int [] arr){// brute force approach
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i< arr.length;i++){
            for(int j = i;j< arr.length;j++){
                currentSum = 0;
                for(int k = i;k<=j;k++){
                  currentSum += arr[ k ];
                }
                System.out.println(currentSum);
                if(maxSum<currentSum){
                    maxSum = currentSum;
                }


            }

        }
        System.out.println("maxSum"+ "="+maxSum);


    }

    static void SubArraySum2( int [] arr){// brute force approach
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
//        int [] prefix = new int[ arr.length];
//        prefix[0] = arr[0];
//        for(int i = 1;i< prefix.length;i++){
//            prefix[i] = prefix[i-1]+arr[i];
//        }
        for(int i = 0;i< arr.length;i++){
//            int start = i;
            int sum = 0;
            for(int j = i;j< arr.length;j++){

                sum+= arr[ j ];
//                int end = j;
//                currentSum = i==0 ? prefix[j]:prefix[j]-prefix[i-1];
//
//                if(maxSum<currentSum){
//                    maxSum = currentSum;
//                }
                if(maxSum<sum){
                    maxSum =sum;
                }


            }

        }
        System.out.println("maxSum"+ "="+maxSum);


    }
}
