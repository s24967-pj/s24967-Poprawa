package com.example.shopee_s24967;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ShopServiceTest {

    private ItemsStorage itemsStorage = new ItemsStorage();

    @Test
    public void isSaldoChanged()
    {
        ShopService shopService = new ShopService(itemsStorage);
        Customer customer = new Customer(1, 10.0d);
        Cart cart = new Cart(customer);
        cart.addItemToCart("beer");

        double customerSaldoBefore = customer.getSaldo();

        shopService.orderItems(cart);

        double customerSaldoAfter = customer.getSaldo();

        assertThat(customerSaldoBefore).isNotEqualTo(customerSaldoAfter);
    }

    @Test
    public void isSaldoNotChanged()
    {
        ShopService shopService = new ShopService(itemsStorage);
        Customer customer = new Customer(1, 10.0d);
        Cart cart = new Cart(customer);
        cart.addItemToCart("itemNotExists");

        double customerSaldoBefore = customer.getSaldo();

        shopService.orderItems(cart);

        double customerSaldoAfter = customer.getSaldo();

        assertThat(customerSaldoBefore).isEqualTo(customerSaldoAfter);
    }
}
