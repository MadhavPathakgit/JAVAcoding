package com.company.methods;

import java.util.Scanner;

public class binomialFunction {
    public static int factorial(int n){
        int fact = 1;
        if (n == 0 || n == 10) {
            return 1;
        }
        else{
            for(int i = 1;i<=n;i++){
                fact = fact*i;
            }
            return fact;

        }
    }
    public static int binoCoff(int n,int r){
        int   n_factorial = factorial(n);
        int r_factorial = factorial(r);
        int nmr_factorial = factorial(n-r);
        int denominator = r_factorial*nmr_factorial;
        int binomialCoefficient;
        binomialCoefficient = n_factorial/denominator;
        return binomialCoefficient;

    }
    public static void main(String[] args) {
        System.out.println("finding binomial coefficient");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("enter the value of r");
        int r = sc.nextInt();


        System.out.print("the binomial coefficient is:");
        System.out.println(binoCoff(n,r));
//        System.out.println(binomialCoefficient);



    }
}
