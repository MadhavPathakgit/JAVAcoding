package com.company.Stacks;

public class CustomStackss {
    public static void main( String[] args ) throws Exception {
        CustomStacks stack = new CustomStacks(10);
        stack.push( 10 );
        stack.push( 4);
        stack.push( 150 );
        stack.push( 105 );
        stack.push( 109);
        System.out.println(stack.pop());
        stack.peek();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
