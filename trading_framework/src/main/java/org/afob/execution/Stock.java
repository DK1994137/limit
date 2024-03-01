package org.afob.execution;

public class Stock {

    private String name;
    private double currentPrice;

    // Constructors, getters, and setters

    public Stock(String name, double currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
    }

    public String getName() {
        return name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
    // Other methods if needed



}
