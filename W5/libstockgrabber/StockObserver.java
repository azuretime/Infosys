package com.example;

public class StockObserver implements Observer {

    private String subscriber;

    public StockObserver(StockGrabber subject, String subscriber){
        subject.register(this);
        this.subscriber = subscriber;
    }

    @Override
    public void update(String msg) {
        System.out.println(subscriber+":"+msg);
    }
}
