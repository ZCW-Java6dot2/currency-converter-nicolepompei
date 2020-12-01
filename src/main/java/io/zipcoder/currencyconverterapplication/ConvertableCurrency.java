package io.zipcoder.currencyconverterapplication;

import java.util.Currency;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        Double currencyToConvert = currencyType.getRate();
        Double currencyBaseValue = this.getType().getRate();

        return currencyToConvert / currencyBaseValue;
    }

    CurrencyType getType();
}
