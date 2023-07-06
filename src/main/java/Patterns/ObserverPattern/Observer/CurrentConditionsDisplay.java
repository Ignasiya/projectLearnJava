package Patterns.ObserverPattern.Observer;

import Patterns.ObserverPattern.Display.DisplayElement;
import Patterns.ObserverPattern.Subject.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Текущее состояние: " + temperature + "F градусов и " + humidity + "% влажности");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}