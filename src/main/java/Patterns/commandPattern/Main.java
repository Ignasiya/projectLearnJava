package Patterns.commandPattern;

import Patterns.commandPattern.devices.ceilingFan.*;
import Patterns.commandPattern.devices.garageDoor.*;
import Patterns.commandPattern.devices.light.*;
import Patterns.commandPattern.devices.stereo.*;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light roomLight = new Light("Комната");
        Light kitchenLight = new Light("Кухня");
        CeilingFan ceilingFan = new CeilingFan("Комната");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Гостинная");

        LightOnCommand roomLightOn = new LightOnCommand("Свет в комнате - ON", roomLight);
        LightOffCommand roomLightOff = new LightOffCommand("Свет в комнате - OFF", roomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand("Свет в кухне - ON", kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand("Свет в кухне - OFF", kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand("Вентилятор в комнате - ON", ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand("Вентилятор в комнате - OFF", ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand("Дверь гаража - UP", garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand("Дверь гаража - DOWN", garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand("Стерео с CD - ON", stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand("Стерео - OFF", stereo);

        remoteControl.setCommand(0, roomLightOn, roomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOffCommand);

        System.out.println(remoteControl);

        remoteControl.onButton(0);
        remoteControl.offButton(0);
        remoteControl.onButton(1);
        remoteControl.offButton(1);
        remoteControl.onButton(2);
        remoteControl.offButton(2);
        remoteControl.onButton(3);
        remoteControl.offButton(3);
        remoteControl.onButton(4);
        remoteControl.offButton(4);
    }
}
