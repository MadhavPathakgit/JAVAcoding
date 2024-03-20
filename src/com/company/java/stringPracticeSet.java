package com.company.java;

public class stringPracticeSet {
    public static void main(String[] args) {
        String name = "MADHAV";
        name  = name.toLowerCase();
        System.out.println(name);
//        question no 2
        String student = "madh av";
        student = student.replace(" ","_");
        System.out.println(student);
//        question no 3
        String letter = "dear $name$ .Thanks a lot!";
       letter =  letter.replace("$name$",",madhav");
        System.out.println(letter);
//        question no 4
          String  MyString= "it is my  string";
        System.out.println(MyString.indexOf("  "));
        System.out.println(MyString.indexOf("   "));
//        Question no 5

        String LETTER  = "\" Dear Harry,This java course is nice.\nThanks.\"";
        System.out.println(LETTER);

    }
}
