package com.company.java;
 class Employee{
    int id;
    String name;
    public void printDetails(){
         System.out.println("my id is:" +id);
         System.out.println("my name  is:" + name);

     }
}
public class CustomClass {
    public static void main(String[] args) {
Employee harry = new Employee();
// setting attributes

harry.id = 12;
harry.name = "harry ";
harry.printDetails();
//        System.out.println(harry.id);
//        System.out.println(harry.name );
    }
}
