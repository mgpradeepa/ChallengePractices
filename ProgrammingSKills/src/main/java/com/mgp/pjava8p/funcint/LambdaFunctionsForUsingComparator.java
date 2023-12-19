package com.mgp.pjava8p.funcint;

import java.util.ArrayList;
import java.util.List;

public class LambdaFunctionsForUsingComparator {
    // compare the price of items and sort in ascending order
    // Change these boolean values to control whether you see
    // the expected answer and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    // Return the largest number in the 'numbers' array.
    static List<Item> sortList(List<Item> items) {

        List<Item> result = new ArrayList<>(items);
        // Your code goes here. Sort the result list using a lambda expression.
        result.sort((Item it1, Item it2) ->
                (int) (it1.getPrice() - it2.getPrice()));
        return result;
    }

    public static class Item {
        int id;
        String name;
        float price;

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public float getPrice() {
            return price;
        }
        public void setPrice(float price) {
            this.price = price;
        }
        public Item(int id, String name, float price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
        @Override
        public String toString() {
            return "[" + this.id + ", " + this.name + ", " + this.price + "]";
        }
    }

    public static void main(String[] args) {
        List<LambdaFunctionsForUsingComparator.Item> items = new ArrayList<>();
        items.add(new LambdaFunctionsForUsingComparator.Item(1, "shirt", 100));
        items.add(new LambdaFunctionsForUsingComparator.Item(2, "shoes", 3800));
        items.add(new LambdaFunctionsForUsingComparator.Item(3, "pants", 1500));
        items.add(new LambdaFunctionsForUsingComparator.Item(4, "hat", 70));
        items.add(new LambdaFunctionsForUsingComparator.Item(5, "jacket", 1250));
        List<LambdaFunctionsForUsingComparator.Item> result = LambdaFunctionsForUsingComparator.sortList(items);
        result.forEach(System.out::println);
    }
}
