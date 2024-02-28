package edu.iu.habahram.remotecontroller.model;

public class CeilingFanLowCommand implements Command{
    CeilingFan ceilingFan;

    @Override
    public String execute() {
        return ceilingFan.low();
    }
}
