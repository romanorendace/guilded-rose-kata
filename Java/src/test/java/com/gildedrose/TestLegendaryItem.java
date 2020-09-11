package com.gildedrose;

import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLegendaryItem {

    @Test
    void testUpdateQualityQualityDoesNotChange() {
        Item[] items = new Item[] { new Item("Sulfuras", 1, 2) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }

    @Test
    void testUpdateQualitySellinDoesNotChange() {
        Item[] items = new Item[] { new Item("Sulfuras", 1, 2) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
    }
}
