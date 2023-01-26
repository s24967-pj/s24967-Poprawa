package com.example.shopee_s24967;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@SpringBootTest

public class ShopServiceMockTest {

    @InjectMocks
    private ShopService shopService;
    @Mock
    private ItemsStorage itemsStorage;

    @Test
    public void isItemListNotEmpty(){
        Item item = new Item("item",10.0);

        when(itemsStorage.getItemsList()).thenReturn(List.of(item));
        assertThat(shopService.getAllItems()).isNotEmpty();
    }
}
