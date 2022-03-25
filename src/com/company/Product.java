package com.company;

public abstract class Product {

    private String name;
    private double price;
    private Currency currency;

    public Product(double price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    public abstract void buyProduct();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
