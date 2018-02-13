package com.example;

public class RoadUser implements Observer {
    private String name;

    public RoadUser(String name, Traffic subject){
        subject.register(this);
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name+" receives alert:"+msg);
    }

}
