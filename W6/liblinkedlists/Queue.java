package com.example;

import java.util.Scanner;

/**
 * Created by Jiang Jinjing on 2017/11/4.
 */

public class Queue {
    public LinkedList list = new LinkedList();

    public void enqueue(int data){
        list.insertAtEnd(data);
    }

    public void dequeue(){
        list.deleteAtPos(list.size);
    }

    public int end(){
        return list.end.getData();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void displayQueue(){
        System.out.print("\nQueue = ");
        list.display();
    }

    public static void main(String[] args)    {
        Scanner scan = new Scanner(System.in);
        Queue queue = new Queue();
        System.out.println("Queue Test\n");
        char ch;
        
        do        {
            System.out.println("Enter choice");
            int choice = scan.nextInt();
            switch (choice)            {
                case 1 :
                    System.out.println("Enter integer element to enqueue");
                    queue.enqueue( scan.nextInt() );
                    queue.displayQueue();
                    break;
                case 2 :
                    System.out.println("Item dequeued = " + queue.end() );
                    queue.dequeue();
                    queue.displayQueue();
                    break;
                case 3 :
                    queue.displayQueue();
                    break;
                case 4 :
                    System.out.println("Empty status = "+ queue.isEmpty());
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
            System.out.println("\nDo you want to continue?");
            ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
    }
}
