package com.company.LinkedList;
import java.util.LinkedList;


public class singlyLinkedList {
    public static void main( String[] args ) {
 CustomLinkedLIst ll = new CustomLinkedLIst();

        ll.insertFirst(  7);
        ll.insertFirst(  7);
        ll.insertFirst(  7);

        ll.insertFirst(4  );
        ll.insertFirst( 5 );
        ll.insertFirst(6  );
        ll.insertFirst(  7);
//        ll.insertAtlast( 63 );
//        ll.insertAtlast(  44);

        ll.DeleteAtLast();
        ll.deleteAtParticular( 2 );
        ll.Display();


    }

}
