package com.example.shopee_s24967;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ItemsStorage{

    private List<Item> itemsList;

    public ItemsStorage() {
        this.itemsList = new ArrayList<>();

        populateItems();
    }

    private void populateItems(){
        Item milk = new Item("milk", 5.50);
        Item beer = new Item("beer", 4.90);
        Item bread = new Item("bread", 2.50);
        Item juice = new Item("juice", 1.50);

        itemsList.add(milk);
        itemsList.add(beer);
        itemsList.add(bread);
        itemsList.add(juice);
    }


    public List<Item> getItemsList() {
        return itemsList;
    }
}
