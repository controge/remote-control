package edu.iu.habahram.remotecontroller.model;

public class CeilingFanMediumCommand implements Command{
    CeilingFan ceilingFan;

    @Override
    public String execute() {
        return ceilingFan.medium();
    }
}
