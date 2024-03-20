package com.company.array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list;
        list = new ArrayList<>(2);
//        list.add(67);
//        list.add(67);
//        list.add(67);
//        System.out.println(list.contains(4));
//        list.set(0,74);
//        list.remove(1);
//        System.out.println(list);
        for(int i = 0;i<5;i++){
            list.add(sc.nextInt());
        }
        for(int i = 0;i<5;i++){
            System.out.println( list.get(i) );
        }

    }
}
