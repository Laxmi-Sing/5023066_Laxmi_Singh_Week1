package DesignPatterns.ObserverPatternExample;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
    private List<Observer> observers;
    private double stockPrice;
    public StockMarket(){
        this.observers=new ArrayList<>();
    }
    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(this.stockPrice);
        }
    }
    public void setStockPrice(double stockPrice){
        this.stockPrice=stockPrice;
        this.notifyObservers();
    }

}
