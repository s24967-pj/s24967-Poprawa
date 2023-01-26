package com.example.shopee_s24967;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private Customer customer;
    private List<String> itemsInCartList;

    public Cart(Customer customer) {
        this.customer = customer;
        itemsInCartList = new ArrayList<String>();
    }

    public void addItemToCart(String itemName)
    {
        itemsInCartList.add(itemName);
    }

    public List<String> getItemsInCartList() {
        return itemsInCartList;
    }

    public Customer getCustomer() {
        return customer;
    }
}
