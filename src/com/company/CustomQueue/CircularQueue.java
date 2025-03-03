package com.company.CustomQueue;

public class CircularQueue {
    protected int[] data;
    public static final int Default_Size = 10;
   protected int end = 0;
    protected int front = 0;
    protected int size= 0;
    public CircularQueue() {
        this(Default_Size);
    }


    public CircularQueue( int size ) {
        this.data = new int[size];

    }
    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size  == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end% data.length;
        size++;
        return  true;

    }
    public int  remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");

        }
       int removed = data[front++];
        front = front% data.length;
        size--;
        return removed;
    }
    public void display(){
        for(int i = front  ; i<end;i++ ){
            System.out.println(data[i]+" ");
        }
    }
}
