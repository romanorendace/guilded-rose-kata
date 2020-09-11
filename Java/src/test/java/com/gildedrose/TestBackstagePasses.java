package com.gildedrose;

import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBackstagePasses {

    @Test
    void testUpdateQualityQualityZeroIfSellInNegativeDays() {
        Item[] items = new Item[] { new Item("Backstage passes", -1, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testUpdateQualityQualityIncreasesByThreeIfSellInZeroDays() {
        Item[] items = new Item[] { new Item("Backstage passes", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }

    @Test
    void testUpdateQualityQualityIncreasesByThreeIfSellInSmallerThan4Days() {
        Item[] items = new Item[] { new Item("Backstage passes", 3, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }

    @Test
    void testUpdateQualityQualityIncreasesByTwoIfSellInSmallerThan11Days() {
        Item[] items = new Item[] { new Item("Backstage passes", 10, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(2, app.items[0].quality);
    }

    @Test
    void testUpdateQualityQualityIncreasesByOneIfSellInGreaterThan10Days() {
        Item[] items = new Item[] { new Item("Backstage passes", 11, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(1, app.items[0].quality);
    }
}
