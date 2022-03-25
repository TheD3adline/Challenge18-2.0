package com.company;

public class Beer extends Product {

    public Beer(double price, Currency currency, String name) {
        super(price, currency);
        this.setName(name);
    }

    @Override
    public void buyProduct() {
        System.out.println("You successfully buy the Beer " + getName() + " for " + getPrice() + " " + getCurrency());
    }
}
