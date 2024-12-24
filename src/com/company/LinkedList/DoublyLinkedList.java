package com.company.LinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;
    public void insertAtFirst( int val){
        Node node = new Node(val);
        node.next = head;
        if(head!= null){

            head.prev = node;
        }else {
            // If the list was empty, tail should also point to the new node
            tail = node;
        }
        head = node;
        node.prev = null;


    }
    public  void Display(){
        Node temp = head;
//        Node last = null;
        while(temp!= null){
            System.out.print(temp.value+"--------> ");
            temp = temp.next;
//            last = temp;
        }
        System.out.println("End");
//             tail = last;

    }
    public void insertAtLast(int val){
        Node node = new Node(val);

        if(head==null){
          node.prev = null;
          head = node;
          return;
        }
        Node last = head;
        while(last.next!= null){
             last = last.next;
        }
        node.next = null;
        node.prev = last;
        last.next = node;

    }
    public void inserAfterNode(int after, int val){
       Node p = find( after );
       Node node = new Node(val);
       if(p == null){
           System.out.println("does not exist ");
           return;

       }
       node.next = p.next;

       p.next = node;
       node.prev = p;
       if(node.next.prev!= null){
           node.next.prev = node;

       }


    }
    public Node find(int value){
        Node node = head;
        while(node!= null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void DisplayRev(){
        Node temp = tail;
        while(temp!= null){
            System.out.print(temp.value+"---->");
            temp = temp.prev;
        }
        System.out.println("start");
    }


    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node( int value ) {
            this.value = value;
        }

        public Node( Node next , Node prev , int value ) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }

        public Node( Node next , Node prev ) {
            this.next = next;
            this.prev = prev;
        }
    }


}
