package OOPS;
class Student{
    public long rollNumber;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;

    }
    public int average(){
        return total()/3;
    }
    public char grade(){
if(average()>=75){
    return 'A';
}
else
    return 'B';


    }


}

public class StudentClass {
    public static void main( String[] args ) {
        Student s1 = new Student();
        System.out.println(   s1.rollNumber = 2105110100077L);
        System.out.println(s1.course = "B.tech");
        s1.m1 = 75;
        s1.m2 =75;
        s1.m3 = 75;
        System.out.println(s1.total());
        System.out.println(s1.average());
        System.out.println(s1.grade());


    }
}
