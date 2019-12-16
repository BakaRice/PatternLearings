package com.example.Observer;

public interface Subject {
    //注册
    void register(Observer observer);
    //取消注册
    void remove(Observer observer);
    //通知观察者
    void notifyObservers();
}
