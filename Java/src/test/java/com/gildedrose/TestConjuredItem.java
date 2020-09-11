package com.gildedrose;

import com.gildedrose.items.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConjuredItem {

    @Test
    void testUpdateQualityQualityDecreaseByTwoSellInPositive() {
        Item[] items = new Item[] { new Item("Conjured", 0, 2) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void testUpdateQualityQualityDecreaseByFourSellInNegative() {
        Item[] items = new Item[] { new Item("Conjured", -1, 4) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }
}
