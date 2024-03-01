package org.afob.execution;

import java.util.List;

public final class ExecutionClient {

    /**
     * Execute a buy order
     * @param name- the product to buy
     * @param currentPrice- the amount to buy
     * @throws ExecutionException
     *
     */
    private Stock st;
    private List<LimitOrder> limitOrders;

    public Stock buy(String name,double currentPrice ) throws ExecutionException {
        st.setName(name);
        st.setCurrentPrice(currentPrice);
        return st;
    }

    /**
     * Execute a sell order
     *
     * @throws ExecutionException
     */
    public void sell(Stock stock) throws ExecutionException {
        // Check if any limit orders can be executed based on the current stock price

        for (LimitOrder order : limitOrders) {
            if (stock.getName().equals(order.getStockNAme()) && stock.getCurrentPrice() <= order.getTargetPrice()) {
                executeOrder(order);
            }
        }

    }

    private void executeOrder(LimitOrder order) {
        // Implement logic to execute the order
        System.out.println("Order Executed: ");
    }


    public static class ExecutionException extends Exception {
        public ExecutionException(String message) {
            super(message);
        }

        public ExecutionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

}
