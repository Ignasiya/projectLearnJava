package Patterns.observerPattern.Subject;

import Patterns.observerPattern.Observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
