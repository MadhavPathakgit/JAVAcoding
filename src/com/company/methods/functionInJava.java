package com.company.methods;

public class functionInJava {
    public static void hello(){
        System.out.println("hello world");
    }
    public static int  sum(int a,int b){
        return a+b;


    }
    public static int  factorial(int n){
        int f = 1;
        if( n == 0|| n==1){
            return 1;
        }
        else{
            for(int i =1;i<=n;i++) {
                f = f*i;


            }
            return f;
        }
    }

    public static void main(String[] args) {
        hello();
        int sum = sum(5,4);
        System.out.println(sum);
       int factorial =  factorial(3);
        System.out.println("factorial of n");
        System.out.println(factorial);

    }
}
