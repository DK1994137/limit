package org.afob.execution;

public class LimitOrder {

    private String orderId;
    private String stockNAme;
    private double targetPrice;
    private int quantity;

    public LimitOrder(String orderId, String stockNAme, double targetPrice, int quantity) {
        this.orderId = orderId;
        this.stockNAme = stockNAme;
        this.targetPrice = targetPrice;
        this.quantity = quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getStockNAme() {
        return stockNAme;
    }

    public double getTargetPrice() {
        return targetPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    // Other methods if needed
}
