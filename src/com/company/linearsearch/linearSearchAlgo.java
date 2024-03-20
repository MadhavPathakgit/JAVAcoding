package com.company.linearsearch;
public class linearSearchAlgo {
//    search in the array:return the index if item found
//    otherwise if item not found return  -1
   public static int linearSearch(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        // run a for loop
      for(int i = 0;i<arr.length;i++)
       {
           if( arr[i]== target){
               return i;
           }

       }
       //this line will execute if none of the return statement
       // hence the target is not found
       return -1;
   }
    public static int linearSearch2(int[]arr,int target){
        if(arr.length==0){
            return -1;
        }
        // run a for loop
        for(int element:arr)
        {
            if(element == target){
                return element;
            }

        }
        //this line will execute if none of the return statement
        // hence the target is not found
        return Integer.MAX_VALUE;
    }
    public static boolean linearSearch3(int[]arr,int target){
        if(arr.length==0){
            return false;
        }
        // run a for loop
        for(int element:arr)
        {
            if(element == target){
                return true;
            }

        }
        //this line will execute if none of the return statement
        // hence the target is not found
        return false;
    }
    public static void main(String[] args) {
       int[] nums = {23,45,66,65,445,};
       int target =445 ;
       int ans=linearSearch(nums,target);
//        int ans=linearSearch2(nums,target);
//        boolean ans=linearSearch3(nums,target);


        System.out.println(ans);


    }
}
