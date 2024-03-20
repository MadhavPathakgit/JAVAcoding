package com.company.methods;

public class variableArgument {
    static int sum(int...arr){
        int result = 0;
        for(int a:arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        int c = sum(4,5,5,5,7);
        System.out.println(c );
    }
}
