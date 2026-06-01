package com.assignment.question;

public class TaskManager extends Publisher{

    private Register register = new Register();

    public void addObserver(Observer observer){
        register.addObserver(observer);
    }

    public void removeObserver(Observer observer){
        register.removeObserver(observer);
    }
    
    public void assignTask(Long taskId, Long userId) {
        register.notifyObservers(taskId, userId);
    }
}