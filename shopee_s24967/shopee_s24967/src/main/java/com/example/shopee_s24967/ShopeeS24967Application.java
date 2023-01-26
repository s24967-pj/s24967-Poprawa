package com.example.shopee_s24967;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShopeeS24967Application {

	private final ShopService shopService;

	public ShopeeS24967Application(ShopService shopService) {
		this.shopService = shopService;

		Customer customer = new Customer(1, 200d);
		Cart cart = new Cart(customer);
		cart.addItemToCart("milk");
		cart.addItemToCart("milk");
		cart.addItemToCart("beer");
		shopService.orderItems(cart);
	}

	public static void main(String[] args) {
		SpringApplication.run(ShopeeS24967Application.class, args);
	}

}
