package com.example;

import java.util.ArrayList;

public class Traffic implements Subject {

    private String message;
    private ArrayList<Observer> observers;

    public Traffic(){
        observers = new ArrayList<>();
    }
    @Override
    public void register(Observer o){observers.add(o);}
    @Override
    public void unregister(Observer o){observers.remove(o);}
    @Override
    public void changeCondition(String S){
        for (Observer o: observers)
            o.update(S);
    }





}