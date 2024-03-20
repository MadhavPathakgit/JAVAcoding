package com.company.java;



public class recursion {
    static int factorial(int x){

if(x==0||x==  1){
return 1;
}
  else{ return  x*factorial(x-1);

    }}
    public static void main(String[] args) {
        int x = 1;
        int factoriall = factorial(x);
        System.out.println(factoriall);

    }
}
