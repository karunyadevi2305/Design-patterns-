/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KARUNYA DEVI M
 */
import java.util.ArrayList;
import java.util.List;

public class CalendarEvent implements Subject {
    private List<Observer> observers;
    private String eventDetails;

    public CalendarEvent() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String eventDetails) {
        for (Observer observer : observers) {
            observer.update(eventDetails);
        }
    }

    public void addEvent(String eventDetails) {
        this.eventDetails = eventDetails;
        notifyObservers(eventDetails);
    }
}

