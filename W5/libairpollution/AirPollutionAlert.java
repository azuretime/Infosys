package com.example;

import java.util.ArrayList;

class AirPollutionAlert implements Subject {

    private double airPollutionIndex;
    private ArrayList<Observer> observers;

    public AirPollutionAlert(){
        observers = new ArrayList<>();
    }
    @Override
    public void register(Observer o){observers.add(o);}
    @Override
    public void unregister(Observer o){observers.remove(o);}
    @Override
    public void notifyObservers(){
        for (Observer o: observers)
            o.update(airPollutionIndex);
    }

    public void setAirPollutionIndex(double airPollutionIndex) {
        this.airPollutionIndex = airPollutionIndex;
        if (airPollutionIndex>100) notifyObservers();
    }
}




