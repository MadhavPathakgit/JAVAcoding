package com.company.array;

public class TrappedRainWater {
    public static int TrappedRainWater(int []height,int width){
        // calculate  left max boundary -  array
        int n = height.length;
        int[] rightMax = new int[n];

        int[] leftMax = new int[n];
        leftMax[0] = height[ 0 ];
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max( height[ i ] ,leftMax[ i-1 ] );
        }

        // calculate right max boundary - array
        rightMax[n-1] = height[n-1 ];
        for(int i = n-2;i>=0;i--){
            rightMax[i] = Math.max( height[ i ] ,rightMax[ i+1 ] );
        }
        //loop
        int trappedRainWater = 0;
        for(int i = 0;i<n;i++){
            // calculate minimum of left and right boundary
          int waterLevel = Math.min(leftMax[i],rightMax[i] );
          trappedRainWater += (waterLevel-height[ i ])*width;

        }
           return trappedRainWater;

    }
    public static void main( String[] args ) {
        int [] height = {4,2,0,6,3,2,5};
        int width = 1;
        System.out.println(TrappedRainWater( height,width ));

    }
}
