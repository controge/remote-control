package edu.iu.habahram.remotecontroller.model;

public class Stereo{
    String power;
    String volume;
    String cd;
    String dvd;
    String radio;


    public String on(){
        power = "on";
        setCd("The Beatles");
        setVolume(8);
        return power;
    }

    public String off(){
        power = "off";
        return power;
    }

    public String setVolume(int vol){
        volume = String.valueOf(vol);
        return volume;
    }

    public String setCd(String name){
        cd = name;
        return cd;
    }

    public String setDvd(String name){
        dvd = name;
        return dvd;
    }
}
