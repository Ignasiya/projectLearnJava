package Patterns.commandPattern;

import Patterns.commandPattern.devices.Command;
import Patterns.commandPattern.devices.MacroCommand;
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

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand("Вентилятор в комнате - HIGH", ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand("Вентилятор в комнате - MEDIUM", ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand("Вентилятор в комнате - LOW", ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand("Вентилятор в комнате - OFF", ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand("Дверь гаража - UP", garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand("Дверь гаража - DOWN", garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand("Стерео с CD - ON", stereo);
        StereoOffCommand stereoOffCommand = new StereoOffCommand("Стерео - OFF", stereo);

        Command[] partyOn = {roomLightOn, kitchenLightOn, garageDoorUp, stereoOnWithCD};
        Command[] partyOff = {roomLightOff, kitchenLightOff, garageDoorDown, stereoOffCommand};

        MacroCommand partyOnMacro = new MacroCommand("Макро команда", partyOn);
        MacroCommand partyOffMacro = new MacroCommand("Макро команда", partyOff);

        remoteControl.setCommand(0, ceilingFanLow, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(2, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(3, partyOnMacro, partyOffMacro);

        remoteControl.onButton(0);
        remoteControl.offButton(0);
        System.out.println(remoteControl);
        remoteControl.undoButton();

        remoteControl.onButton(1);
        System.out.println(remoteControl);
        remoteControl.undoButton();

        System.out.println("-----Pushing Macro On-----");
        remoteControl.onButton(3);
        System.out.println("-----Pushing Macro Off-----");
        remoteControl.offButton(3);
    }
}
