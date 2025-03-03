package com.company.CustomQueue;

public class customQueue {
    protected int[] data;
    private static final int DEFAULT_Size = 10;
    int end = 0;
    public customQueue() {
        this(DEFAULT_Size);
    }


    public customQueue( int size ) {
        this.data = new int[size];

    }
    public boolean isFull(){
        return end == data.length;
    }
    public boolean isEmpty(){
        return end == 0;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]= item;
        return true;

    }
    public int  remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");

        }
        int removed = data[0];
        // shift the element to left;
        for(int i = 1 ;i< end;i++){
             data[i-1]= data[i];
        }
        end--;
      return removed;
    }
    public void display(){
        for(int i = 0 ; i<end;i++ ){
            System.out.println(data[i]+" ");
        }
    }

}