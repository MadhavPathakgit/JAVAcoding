package com.company.java;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
       int  age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you are going to be an adult");
                break;
            case 23:
                System.out.println("you are going to join a job!");
                case 60:

                    System.out.println("u r going to be retired");
                    break;
                    default:
                        System.out.println("enjoy  your life");
                }
            }}




