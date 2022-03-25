package com.company;

public class Pen extends Product {

    public Pen(double price, Currency currency, String name) {
        super(price, currency);
        this.setName(name);
    }

    @Override
    public void buyProduct() {
        System.out.println("You successfully buy the Pen " + getName() + " for " + getPrice() + " " + getCurrency());
    }
}
