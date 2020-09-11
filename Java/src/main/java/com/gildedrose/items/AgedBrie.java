package com.gildedrose.items;

public class AgedBrie extends UpdatableItem {

    public AgedBrie(Item item) {super(item);}

    @Override
    public void updateQuality() {
        incrementQuality();
    }

}
