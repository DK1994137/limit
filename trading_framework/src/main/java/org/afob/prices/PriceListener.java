package org.afob.prices;

import org.afob.execution.Stock;

import java.math.BigDecimal;
import java.util.List;

public interface PriceListener {

    /**
     *
     *  take stock params
     */
    List<Stock> priceTick(Stock st);

}
