package com.company.CustomQueue;

public class customqueuee {
    public static void main( String[] args ) throws Exception{
        customQueue queue = new customQueue(10);
        queue.insert( 20 );
        queue.insert( 21 );
        queue.insert( 24 );
        queue.insert( 25 );
        System.out.println(queue.remove() + " ----------->    removed ");
        System.out.println("The queue is :");
    queue.display();
    }
}
