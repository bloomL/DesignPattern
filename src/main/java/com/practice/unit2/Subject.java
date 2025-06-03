package com.practice.unit2;

/**
 * java.util.Observer
 * java.util.Observable 主题
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
