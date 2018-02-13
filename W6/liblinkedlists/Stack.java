package com.example;

import java.util.Scanner;

/**
 * Created by Jiang Jinjing on 2017/11/3.
 */

public class Stack {
    public LinkedList list = new LinkedList();

    public void push(int data){
        list.insertAtStart(data);
    }

    public void pop(){
        list.deleteAtPos(1);
    }

    public int top(){
        return list.start.getData();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void displayStack(){
        System.out.print("\nStack = ");
        list.display();
    }

    public static void main(String[] args)    {
        Scanner scan = new Scanner(System.in);
        Stack stack = new Stack();
        System.out.println("Stack Test\n");

        do        {
            int choice = scan.nextInt();
            switch (choice)            {
                case 1 :
                    System.out.println("Enter integer element to push");
                    stack.push( scan.nextInt() );
                    stack.displayStack();
                    break;
                case 2 :
                    System.out.println("The element at the top of stack is "+stack.top());
                    break;
                case 3 :
                    System.out.println("Item popped = "+stack.top());
                    stack.pop();
                    stack.displayStack();
                    break;
                case 4 :
                    System.out.println("Empty status = "+ stack.isEmpty());
                    break;
                case 5 :
                    stack.displayStack();
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
        } while (true);
    }
}

