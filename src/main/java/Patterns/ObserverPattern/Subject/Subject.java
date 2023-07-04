package Patterns.ObserverPattern.Subject;

import Patterns.ObserverPattern.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
