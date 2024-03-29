package edu.iu.habahram.remotecontroller.repository;

import edu.iu.habahram.remotecontroller.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoteLoader implements  IRemoteLoader{
    HashMap<Integer, RemoteControl> remoteControls = new HashMap<>();
    private static RemoteLoader remoteLoader = new RemoteLoader();
    private RemoteLoader(){}

    public static RemoteLoader getInstance(){
        return remoteLoader;
    }
    @Override
    public void setup(int id, List<DeviceData> devices) {
        RemoteControl remoteControl = new RemoteControl(devices.size());
        for(DeviceData device : devices) {
            switch (device.type()) {
                case "light":
                    Light light = new Light(device.location());
                    remoteControl.setCommand(device.slot(), light::on, light::off);
                    break;
                case "stereo":
                    Stereo stereo = new Stereo();
                    remoteControl.setCommand(device.slot(), stereo::on, stereo::off);
                    break;
                case "ceiling fan":
                    CeilingFan ceilingFan = new CeilingFan();
                    remoteControl.setCommand(device.slot(), ceilingFan::low, ceilingFan::off);
                    break;
            }
        }
        remoteControls.put(id, remoteControl);
        System.out.println(remoteControl.toString());
    }

    @Override
    public String onButtonWasPushed(int id, int slot) {
         return remoteControls.get(id).onButtonWasPushed(slot);
    }

    @Override
    public String offButtonWasPushed(int id, int slot) {
        return remoteControls.get(id).offButtonWasPushed(slot);

    }
}
