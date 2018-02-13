package com.example;

import java.util.Scanner;

/**
 * Created by Jiang Jinjing on 2017/11/4.
 */
class StockObject{
    public String header;
    public int val;

    public StockObject next;
    public StockObject prev;

    public StockObject(String header, int val){
        this.header = header;
        this.val = val;
    }
}

public class StockObjectList {
    StockObject start;
    StockObject end;
    public int size;
    public int counter=0;

    public void enterObject(String header){

        StockObject theNewLink = new StockObject(header,header.length());

        StockObject previousStockObject = null;

        StockObject currentStockObject = start;

        while((currentStockObject != null) && (header.length() > currentStockObject.val)){

            previousStockObject = currentStockObject;

            currentStockObject = currentStockObject.next; // Get the next StockObject

        }
        if(previousStockObject == null){

            start = theNewLink;

        } else {

            previousStockObject.next = theNewLink;
        }
        theNewLink.next = currentStockObject;

        size++;
    }


    public void dumpObjects(){
        System.out.print("\nStock Object List = ");
        if (size == 0)        {
            System.out.print("empty\n");
            return;
        }
        if (start.next == null)        {
            System.out.println(start.header + " Header: " + start.val);
            return;
        }
        StockObject ptr = start;
        System.out.print(start.header+ " Header: " + start.val +" <-> ");
        ptr = start.next;
        while (ptr.next != null)        {
            System.out.print(ptr.header+" Header: " + ptr.val + " <-> ");
            ptr = ptr.next;
        }
        System.out.print(ptr.header +" Header: " + ptr.val + "\n");
    }

    public void dumpObject(int pos) {
        StockObject ptr = start;
        counter=0;
        if (!isEmpty()){
            while (ptr != null){
                counter++;
                if (counter==pos){
                    System.out.print(ptr.header);
                    break;
                }
                ptr = ptr.next;
            }
        }else{
            System.out.print("Empty List");
        }
    }

    public boolean isEmpty(){
        return start == null;
    }


    public static void main(String[] args)    {
        Scanner scan = new Scanner(System.in);
        StockObjectList StockObjectList = new StockObjectList();
        System.out.println("StockObjectList Test\n");

        do        {
            System.out.println("\nEnter choice");
            int choice = scan.nextInt();
            int index;
            switch (choice)            {
                case 1 :
                    System.out.println("Enter object");
                    Scanner scan2 = new Scanner(System.in);
                    StockObjectList.enterObject( scan2.nextLine());
                    break;
                case 2 :
                    System.out.println("Enter object index");
                    Scanner scan3 = new Scanner(System.in);
                    index = scan3.nextInt();
                    System.out.println("Display object (" + index+")" );
                    StockObjectList.dumpObject(index);
                    break;
                case 3 :
                    System.out.println("Dump");
                    StockObjectList.dumpObjects();
                    break;
                case 4 :
                    System.out.println("Empty status = "+ StockObjectList.isEmpty());
                    break;
                default :
                    System.out.println("Wrong Entry \n ");
                    break;
            }
        } while (true);
    }
}
