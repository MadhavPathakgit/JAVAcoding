package com.company.methods;

public class MethodsInJAVA {

   static int logic(int x,int y){
       int z;
       if(x>y){
           z = x+y;
       }
       else{
      z = (x+y)*5;
       }
       return z;
    }
    public static void main(String[] args) {
   //        MethodsInJAVA obj  = new MethodsInJAVA();
//       int  c = obj.logic(5,8);
//


int c = logic(5,7);
        System.out.println(c);

    }

}
