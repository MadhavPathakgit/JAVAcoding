package com.company.LinkedList;

public class DLL {
    public static void main( String[] args ) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtFirst( 7 );
        dll.insertAtFirst( 6);
        dll.insertAtFirst( 5 );
        dll.insertAtFirst( 4);
        dll.insertAtFirst( 3 );
        dll.insertAtFirst( 2);
//        dll.insertAtLast( 43 );
        dll.inserAfterNode( 5,45 );
        dll.Display();
        System.out.println();
        dll.DisplayRev();
    }
}
