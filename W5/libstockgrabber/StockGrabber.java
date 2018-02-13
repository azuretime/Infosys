package com.example;

import java.util.ArrayList;

public class StockGrabber implements Subject {
     // your code goes here
    private String message;
    private ArrayList<Observer> observers;

    public StockGrabber(){
        observers = new ArrayList<>();
    }
    @Override
    public void register(Observer o){observers.add(o);}
    @Override
    public void unregister(Observer o){observers.remove(o);}
    @Override
    public void stockUpdate(String S){
        for (Observer o: observers)
            o.update(S);
    }
}
