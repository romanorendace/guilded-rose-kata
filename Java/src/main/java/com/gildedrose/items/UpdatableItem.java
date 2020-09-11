package com.gildedrose.items;

public class UpdatableItem extends Item {

    public UpdatableItem(Item item) {super(item.name, item.sellIn, item.quality);}

    public void update() {
        updateQuality();
        updateSellIn();
    }

    // OVERRIDE FOR NON STANDARD ITEMS
    protected void updateQuality() {
        if(isSellByDatePassed()) {
            decreaseQualityBy(2);
        } else {
            decrementQuality();
        }
    }

    protected void updateSellIn() {
        sellIn -= 1;
    }

    protected void decreaseQualityBy(int amount) {
        int newQuality = quality - amount;
        if (newQuality >= 0) {
            quality = newQuality;
        }
    }

    protected void decrementQuality() {
        decreaseQualityBy(1);
    }

    protected void increaseQualityBy(int amount) {
        int newQuality = quality + amount;
        if (newQuality <= 50) {
            quality = newQuality;
        } else {
            quality = 50;
        }
    }

    protected void incrementQuality() {
        increaseQualityBy(1);
    }

    protected boolean isSellByDatePassed() {
        return sellIn < 0;
    }
}
