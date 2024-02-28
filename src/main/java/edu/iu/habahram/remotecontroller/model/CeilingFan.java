package edu.iu.habahram.remotecontroller.model;

public class CeilingFan {

    String power;
    String speed;

    public String high(){
        if(power.equals("off")){
            power = "on";
        }
        this.speed = "high";
        return speed;
    }

    public String medium(){
        if(power.equals("off")){
            power = "on";
        }
        this.speed = "medium";
        return speed;
    }

    public String low(){
        if(power.equals("off")){
            power = "on";
        }
        this.speed = "low";
        return speed;
    }

    public String off(){
        power = "off";
        return power;
    }

    public String getSpeed(){
        return speed;
    }



}
