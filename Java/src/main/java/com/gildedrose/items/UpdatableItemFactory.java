package com.gildedrose.items;

public class UpdatableItemFactory {

    public static UpdatableItem getUpdatableItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("Item is null");
        }
        else if(isAgedBrie(item)) {
            return new AgedBrie(item);
        }
        else if (isBackstagePasses(item)) {
            return new BackstagePasses(item);
        }
        else if (isLegendaryItem(item)) {
            return new LegendaryItem(item);
        }
        else if (isConjuredItem(item)) {
            return new ConjuredItem(item);
        }
        else {
            return new UpdatableItem(item);
        }
    }

    private static boolean isAgedBrie(Item item) {
        return item.name.toUpperCase().contains("AGED BRIE");
    }

    private static boolean isBackstagePasses(Item item) {
        return item.name.toUpperCase().contains("BACKSTAGE PASSES");
    }

    private static boolean isConjuredItem(Item item) {
        return item.name.toUpperCase().contains("CONJURED");
    }

    private static boolean isLegendaryItem(Item item) {
        String[] legendaryItems = {"SULFURAS"};

        for (String legendary : legendaryItems) {
            if (item.name.toUpperCase().contains(legendary)) {
                return true;
            }
        }
        return false;
    }
}
