package com.example;

class Subscriber implements Observer{
    private String subscriber;

    public Subscriber( String subscriber, AirPollutionAlert subject){
        subject.register(this);
        this.subscriber = subscriber;
    }

    @Override
    public void update(double airPollutionIndex) {
        System.out.println(subscriber+" received notification: "+airPollutionIndex);
    }
}

