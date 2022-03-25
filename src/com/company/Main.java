package com.company;

public class Main {

    public static void main(String[] args) {

        Pen pen = new Pen(1.99, Currency.Euro, "Faber-Castell X1 Fineliner in Blau");
        Beer beer1 = new Beer(1.59, Currency.Dollar, "Puntigamer Zwickl 1l Glasflasche");
        Beer beer2 = new Beer(130, Currency.Yen, "Goesser Maerzen 0,5l Dose");

        pen.buyProduct();
        beer1.buyProduct();
        beer2.buyProduct();
    }
}
