package com.example.shopee_s24967;

public class Item {
    private String przedmiot;
    private double cena;

    public Item(String przedmiot, double cena) {
        this.przedmiot = przedmiot;
        this.cena = cena;
    }


    public String getPrzedmiot() {
        return przedmiot;
    }

    public double getCena() {
        return cena;
    }
}
