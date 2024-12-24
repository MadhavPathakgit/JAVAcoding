package com.company.LinkedList;

public class CustomLinkedLIst {
    private Node head;
    private Node tail;
    private int size;

    public CustomLinkedLIst() {
        this .size = 0;
    }

    // insert at first;
    public  void  insertFirst( int val){
        Node newnode = new Node(val );
        newnode.next = head;
        head= newnode;
        if(tail== null){
            tail = head;
        }
        size += 1;


    }
    // insert at LAST
    public void insertAtlast(int val){
        if ( tail == null ) {
            insertFirst( val );
            size+= 1;
            return;

        }

            Node newnode = new Node( val );
            tail.next = newnode;
            tail = newnode;

            size++;


    }
    //insert at any point in the linked List
    public void InsertionOnAnyPosition(int val, int index){
        if(index==0){
            insertFirst( val );
            return;
        }
        if(index== size){
            insertAtlast( val );
            return;
        }
        Node temp = head;
        for(int i = 0;i<index;i++){
            temp = temp.next;
        }
        Node newNode = new Node( val ,temp.next);
        temp.next = newNode;

        size++;




    }
    // delete first
    public  int deletefirst(){
        int val = head.value;
        head = head.next;
        if(head== tail){
            head = head.next;
             tail = tail.next;

        }
        size--;
        return val;
    }
    // delete last
    public int DeleteAtLast(){
        if(size<=1){
            return deletefirst();
        }
        Node temp = head;
        for(int i = 0;i<size-2;i++){
            temp = temp.next;
        }
        int val = tail.value;
        tail  = temp;
        temp.next = null;

        return  val;



    }
    // delete at particularINdex
    public int deleteAtParticular(int index){
        if(index == 0){
            return deletefirst();

        }
        if(index == size-1){
            return DeleteAtLast();

        }
        Node prev = head;

        for(int i = 0;i<index-1;i++){
            prev= prev.next;
        }
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;

    }
    // display function for linkedList
    public  void Display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value+"--------> ");
            temp = temp.next;
        }
        System.out.println("End");


    }
  

    private class Node{
      private int value;
       private Node next;

      public Node( int value ) {
          this.value = value;
      }

      public Node( int value,Node next   ) {
          this.next = next;
          this.value = value;
      }


  }
}
