package com.company.Stacks;

public class CustomStacks {
    protected int[] data;
    private static final int DEFAULT_Size = 10;
    int ptr = - 1;

    public CustomStacks() {
        this( DEFAULT_Size );
    }

    public CustomStacks( int size ) {
        this.data = new int[ size ];
    }

    public boolean push( int item ) {
        if(isFull()){
            System.out.println("Stack OverFlow");
            return false;

        }
        ptr++;
        data[ ptr ] = item;
        return true;
    }
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("cannot pop from an empty stack !");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
     }
     public int peek() throws Exception{
         if(isEmpty()){
             throw new Exception("cannot peek in   an empty stack !");
         }
        return data[ptr];
     }
    public boolean isFull(){
      return ptr == data.length-1;
    }
    public boolean isEmpty(){
        return ptr ==  -1;
    }
}
