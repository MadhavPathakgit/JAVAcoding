package com.company.linearsearch;

public class evenNumberofDigits {
    //1295 leet code
    //  no of no that have even no if digits;
    static int findNumbers(int[] nums){
        int count = 0;
for (int num:nums){
    if(even(num)){
        count++;
    }
        }

        return count;

    }
    // function to check wheteher it contain even no of digits
    static boolean even(int num){
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2==0){
            return true;
        }

            return false;


    }
//    static int digit2(int num){
//        if(num<0){
//            num = num * (-1);
//        }
//        return (int)(Math.log10(num))+1;
//    }
    static int digits(int num){
        if(num<0){
            num = num * (-1);
        }
        if(num==0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;

    }
    public static void main(String[] args) {
int[] num = {12,345,2,65 ,7896};
        System.out.println(findNumbers(num));

    }
}
