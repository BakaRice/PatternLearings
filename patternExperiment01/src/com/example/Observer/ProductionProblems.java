package com.example.Observer;

import java.util.HashSet;
import java.util.Set;

public class ProductionProblems implements Subject {
    //观察者列表
    public Set<Observer> observerSet;

    //生产问题信息
    private String messege;

    public ProductionProblems() {
        observerSet = new HashSet<>();
    }

    public void setMessage(String messege) {
        this.messege = messege;
    }

    @Override
    public void register(Observer observer) {
        observerSet.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerSet.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerSet.forEach(worker -> worker.update(messege));
    }
}
