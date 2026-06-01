package com.assignment.question;

public abstract class Publisher {

    public abstract void addObserver(Observer observer);

    public abstract void removeObserver(Observer observer);
    
    public abstract void assignTask(Long taskId, Long userId);
}