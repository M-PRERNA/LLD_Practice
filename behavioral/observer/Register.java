package com.assignment.question;

import java.util.ArrayList;
import java.util.List;

public class Register implements ObserverRegistry{
    private List<Observer> observerList = new ArrayList<>();

    public void addObserver(Observer observer){
        observerList.add(observer);
    }

    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }

    public void notifyObservers(Long taskId, Long userId){
        for(Observer observer : observerList){
            observer.sendNotification(taskId, userId);
        }
    }
}
