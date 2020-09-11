package com.gildedrose.items;

public class ConjuredItem extends UpdatableItem {

    public ConjuredItem(Item item) { super(item); }

    @Override
    public void updateQuality() {
        if(isSellByDatePassed()) {
            decreaseQualityBy(4);
        } else {
            decreaseQualityBy(2);
        }
    }

}
