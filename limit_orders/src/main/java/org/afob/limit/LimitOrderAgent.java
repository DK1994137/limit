package org.afob.limit;

import org.afob.execution.ExecutionClient;
import org.afob.execution.Stock;
import org.afob.prices.PriceListener;

import java.math.BigDecimal;
import java.util.List;

public class LimitOrderAgent implements PriceListener {
    public List<Stock> stockList;

    public LimitOrderAgent(final ExecutionClient ec) {
    }


    @Override
    public List<Stock> priceTick(Stock st) {
        stockList.add(st);
        return  stockList;

    }

}
