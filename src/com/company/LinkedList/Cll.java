package com.company.LinkedList;

public class Cll {
    public static void main( String[] args ) {

        CircularLinkedList cll = new CircularLinkedList();
        cll.insert( 45);
        cll.insert( 5);
        cll.insert( 4);
        cll.insert( 48);
        cll.insert( 48);
        cll.delete( 5 );
        cll.display();
    }
}
