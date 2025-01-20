package BehavioralDesignPatterns.CommandDesignPattern;
//command interface
interface command{
    void execute();
}

interface Device{
    void turnOn();
    void turnOff();
}

class turnOnCommand implements command{
    private Device device;
    public turnOnCommand(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.turnOn();
    }
}
class turnOffCommand implements command{
    private Device device;
    public turnOffCommand(Device device){
        this.device = device;
    }
    @Override
    public void execute() {
        device.turnOff();
    }
}

// Concrete command for adjusting the volume of a stereo
class AdjustVolumeCommand implements command {
    private Stereo stereo;

    public AdjustVolumeCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.adjustVolume();
    }
}

// Concrete command for changing the channel of a TV
class ChangeChannelCommand implements command {
    private TV tv;

    public ChangeChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}

class TV implements Device{
    @Override
    public void turnOn() {
        System.out.println("TV is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned off");
    }
    public void changeChannel(){
        System.out.println("Channel changed");
    }
}
class Stereo implements Device{
    @Override
    public void turnOn() {
        System.out.println("Stereo is turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Stereo is turned off");
    }
    public void adjustVolume(){
        System.out.println("volume changed");
    }
}

class RemoteControl{
    private command command;
    public void setCommand(command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}

public class CommandPattern {
    //    Imagine you are tasked with designing a remote control system for various
//    electronic devices in a smart home. The devices include a TV, a stereo,
//    and potentially other appliances.
//    The goal is to create a flexible remote control that can handle
//    different types of commands for each device,
//    such as turning devices on/off, adjusting settings, or changing channels.
    public static void main(String[] args) {
        TV tv=new TV();
        Stereo stereo=new Stereo();

        RemoteControl remoteControl=new RemoteControl();
        remoteControl.setCommand(new turnOnCommand(tv));
        remoteControl.pressButton();

        remoteControl.setCommand(new turnOffCommand(tv));
        remoteControl.pressButton();
        remoteControl.setCommand(new ChangeChannelCommand(tv));
        remoteControl.pressButton();
    }
}
