package util;

public class CurrencyConverter {
    public static final double currencyTaxa = 0.06;

    public double total (double priceDollar, double dollarQuantity) {
        double result = priceDollar * dollarQuantity;

        return result + (result * currencyTaxa);
    }
}
