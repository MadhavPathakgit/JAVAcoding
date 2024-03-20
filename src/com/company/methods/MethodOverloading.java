package com.company.methods;

public class MethodOverloading {
    static void foo(){
        System.out.println("good morning bro");
    }
    static void foo(int a){
        System.out.println("good morning "+a+"  bro");
    }
    public static void main(String[] args) {
        foo();
        foo(3000);
//        method OVERLOADING Definition
//        Multiple functions with the same name but different parameters
//         **************arguments are actual*********
        
    }
}
