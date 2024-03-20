package com.company.methods;

import java.util.Scanner;


public class cbseboardpercentagecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the marks of physics");
        int physics = sc.nextInt();
        System.out.println("enter the marks of maths");
        int maths = sc.nextInt();

        System.out.println("enter the marks of chemistry");
        int chemistry = sc.nextInt();

        System.out.println("enter the marks of general knowledge");
        int GeneralKnowledge = sc.nextInt();
        int Marks = physics+GeneralKnowledge+chemistry+maths;
//        System.out.println(Marks);
        float  mark = (float) Marks /400;

//        System.out.println(mark);
        float percentage = mark*100;
        System.out.println("the percentage of student are:");
        System.out.print(percentage );
        System.out.print("%");





    }
}
