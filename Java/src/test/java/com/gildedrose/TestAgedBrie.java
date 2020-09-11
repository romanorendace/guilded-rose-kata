package com.gildedrose;

import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAgedBrie {

    @Test
    void testUpdateQualityQualityNotGreaterThanFifty() {
        Item[] items = new Item[] { new Item("Aged brie", 0, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void testUpdateQualityQualityIncreasesByOne() {
        Item[] items = new Item[] { new Item("Aged brie", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
    }
}
