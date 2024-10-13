package com.company.divideAndConquer;

import java.util.ArrayList;

public class DiceAmazonproblem {
    public static void main( String[] args ) {
        int target = 4;
        System.out.println(dice("",4 ));

    }
   public  static ArrayList<String> dice(String P, int target){
        if(target==0){
            ArrayList<String> list = new ArrayList<>();
//            System.out.println(P);
            list.add( P );
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 1  ;i<=6 && i<= target;i++){
       ans.addAll(   dice( P+i, target-i));
        }
        return ans;
    }

}
