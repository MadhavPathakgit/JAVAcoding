package com.company.java;
class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void getId(int i){
        id = i;
    }
    public int setId(){
        return id;
    }
}
public class GetterSetter {

    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        harry.setName("madhav");
        System.out.println(harry.getName());
       // harry.setId(24);


    }
}
