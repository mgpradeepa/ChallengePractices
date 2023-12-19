package com.mgp.pjava8p.funcint;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaForFilterAndSortUsingStream {

    // Filter and sort the items array.
    static List<Item> getFilteredData(List<Item> items, float maxPrice) {
        // Your code goes here.
        items.stream()
                .filter(p-> p.getPrice() <= maxPrice)
                .sorted(Comparator.comparing(Item::getPrice)).collect(Collectors.toList());
        return items;
    }

    // A model class holding each item's values
    public static class Item {
        private int id;
        private String name;
        private float price;
        private int quantity;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getPrice() {
            return price;
        }

        public Item(int id, String name, float price, int quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "[" + this.id + ", " + this.name + ", " + this.price + ", " + this.quantity + "]";
        }
    }


    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new LambdaForFilterAndSortUsingStream.Item(1, "shirt", 100, 2));
        items.add(new LambdaForFilterAndSortUsingStream.Item(2, "shoes", 3800, 1));
        items.add(new LambdaForFilterAndSortUsingStream.Item(3, "pants", 1500, 3));
        items.add(new LambdaForFilterAndSortUsingStream.Item(4, "hat", 70, 5));
        items.add(new LambdaForFilterAndSortUsingStream.Item(5, "jacket", 1250, 1));
// Max price to filter for
        float maxPrice = 200;
// Call the LambdaForFilterAndSortUsingStream code
        List<LambdaForFilterAndSortUsingStream.Item> result = LambdaForFilterAndSortUsingStream.getFilteredData(items, maxPrice);
        System.out.println(result);
        
    }
}
