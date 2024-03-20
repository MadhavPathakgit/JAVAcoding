package com.company.array;

public class arrays {
    public static void main(String[] args) {
//        int[] marks =  new int[5];
        int[]marks  = {100,29,20,50,40};
//        marks[0]= 100;
//        marks[1]= 97;
//        marks[2]= 90;
//        marks[3]= 90;
//        System.out.println(marks[4]);
//        System.out.println(marks.length);
//        String [] student = {"madhav","keshav"};
//        System.out.println(student[0]);
        // FOR EACH LOOP
//        marks.re
         for (int mark : marks) {
            System.out.println(mark);
        }
        System.out.println(marks.length);
    }
//    class Solution {
//        public void rotate(int[] nums, int k) {
//            // k = k % nums.length;
//            int n = nums.length;
//            int[] temp  =  new int[k+1];
//            for(int i = 0;i<=k;i++){
//                temp [i] =  nums[i];
//            }
//            for(int i =k+1;i<n;i++){
//                nums[i-(k+1)] = nums[i];
//            }
//            for(int  i = n-(k+1);i<n;i++){
//                nums[i] = temp[i-(n-(k+1))];
//
//            }
//
//        }
//    }
}
