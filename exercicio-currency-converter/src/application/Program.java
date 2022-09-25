package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter currencyConverter = new CurrencyConverter();


        System.out.println("What is the dollar price? ");
        double priceDollar = sc.nextFloat();

        System.out.println("How many dollars will be bought? ");
        double dollarQuantity = sc.nextFloat();

        System.out.printf("Amount to be paid in reais = R$%.2f%n",
               currencyConverter.total(dollarQuantity, priceDollar));

        sc.close();
    }
}
