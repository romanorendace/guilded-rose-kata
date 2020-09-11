package com.gildedrose.items;

public class BackstagePasses extends UpdatableItem {

    public BackstagePasses(Item item) {super(item);}

    @Override
    public void updateQuality() {
        if (isSellByDatePassed()) {
            quality = 0;
        }
        else if (sellIn <= 5) {
            increaseQualityBy(3);
        }
        else if (sellIn <= 10) {
            increaseQualityBy(2);
        }
        else {
            incrementQuality();
        }
    }

}
