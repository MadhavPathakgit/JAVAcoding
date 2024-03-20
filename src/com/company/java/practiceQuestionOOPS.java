package com.company.java;

/*class Employee1{
   String  name;
   int salary;

    public int getSalary(){
        return salary;}
    public String Getname(){
return name;
    }
    public void Setname(String n){
        name = n;
    }


}
class CellPhone{
    public void ringing(){
        System.out.println("your cellphone is ringing");
    }
    public void vibrating(){
        System.out.println("your cellphone is vibrating");
    }
}*/
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

public class practiceQuestionOOPS {
    public static void main(String[] args) {
      /*  Employee1 harry  = new Employee1();
        harry.Setname("harriskhan");
        System.out.println(harry.Getname());
        harry.salary = 200000;
        System.out.println(harry.getSalary());
//        question no 2
        CellPhone  pocoM2 = new CellPhone();
        pocoM2.ringing();
        pocoM2.vibrating();*/

//        question no 3;
        square Square = new square();
        Square.side = 5;
        System.out.println(Square.area());
        System.out.println(Square.perimeter());
//        System.out.print("the length of side of square is:");
//        int side = Square.side(length);
//        System.out.println(side);
//        System.out.print("the area of square is :");
//        int Area = Square.area(length);
//        System.out.println(Area);
//        System.out.print("the perimeter of square is :");
//        int perimter = Square.perimeter(length);
//        System.out.print(perimter);










    }
}
