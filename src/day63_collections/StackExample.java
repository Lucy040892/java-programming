package day63_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        //LIFO (last in first out)

        Stack<String> bookStack = new Stack<>();
        bookStack.add("Harry Potter");
        bookStack.add("Leaders eat last");
        bookStack.add("Java intro");
        bookStack.push("Cucumber"); // similar to add
        System.out.println(bookStack);

        //bookStack.pop(); //removes and returns the top of the stack item
        System.out.println("We remove this (last in): " +bookStack.pop());
        System.out.println("Final version: " +bookStack);
        System.out.println("This is at the top of the stack: " +bookStack.peek()); //this method just pick last in , do not remove
        System.out.println(bookStack);
    }
}
