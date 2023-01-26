package com.example.shopee_s24967;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShopService {

    private final ItemsStorage itemsStorage;

    public ShopService( ItemsStorage itemsStorage) {

        this.itemsStorage = itemsStorage;
    }

    public List<Item> getAllItems()
    {
        return itemsStorage.getItemsList();
    }

    public void orderItems(Cart cart){
        List<Item> itemsInShop = itemsStorage.getItemsList();
        List<String> itemsInCart = cart.getItemsInCartList();
        Customer customer = cart.getCustomer();
        double saldo = customer.getSaldo();
        double sum = 0d;

        for (String itemInCart : itemsInCart) {

            for (Item itemInShop : itemsInShop)
            {
                if (itemInCart.equals(itemInShop.getPrzedmiot()))
                {
                    sum += itemInShop.getCena();
                }
            }
        }

        if (saldo >= sum)
        {
            double newSaldo = saldo - sum;
            customer.setSaldo(newSaldo);
            System.out.println("Sukces, udane zakupy. Cena za zakupy: " + sum + " pozostałe saldo " + newSaldo);
        }
        else
        {
            System.out.println("Nieudane zakupy. Masz za mało pieniędzy. Saldo: " + saldo + " cena: " + sum );
        }
    }


}
