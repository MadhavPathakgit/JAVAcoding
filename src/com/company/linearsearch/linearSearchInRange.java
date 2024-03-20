package com.company.linearsearch;

public class linearSearchInRange {
    static int linearsearch(int[]arr,int target ,int start,int end){
        if(arr.length==0){
            return -1;
        }
        // run a for loop
        for(int i = start;i<=end;i++)
        {  int element = arr[i];
            if(element == target){
                return i;
            }

        }
        //this line will execute if none of the return statement
        // hence the target is not found
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {45,44,4,7,7,8,5,4,5,1,};
        int target = 8;
        int ans = linearsearch(arr,target,5,8);
        System.out.println(ans);

    }
}
