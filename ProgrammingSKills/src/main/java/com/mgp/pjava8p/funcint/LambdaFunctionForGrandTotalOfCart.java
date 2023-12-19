package com.mgp.pjava8p.funcint;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class LambdaFunctionForGrandTotalOfCart {

    // Change these boolean values to control whether you see
    // the expected answer and/or hints.

    // Return the total value of the shopping cart in the items array.
    static float getCartTotal(List<Item> items) {
        // Your code goes here. Use an internal iterator (Java's forEach() method)
        // to add each item's value to the cart.
        AtomicReference<Float> total = new AtomicReference<Float>(0f);
        items.forEach(item -> total.updateAndGet(v -> v + item.getQuantity() * item.getPrice()));
        return total.get();
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

        public int getQuantity() {
            return quantity;
        }

        public Item(int id, String name, float price, int quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return "[" + this.id + ", " + this.name + ", " + this.price + "]";
        }


        public static void main(String[] args) {
            // You can edit this code to try different testing cases.
            List<LambdaFunctionForGrandTotalOfCart.Item> items = new ArrayList<>();
            items.add(new LambdaFunctionForGrandTotalOfCart.Item(1, "shirt", 100, 2));
            items.add(new LambdaFunctionForGrandTotalOfCart.Item(2, "shoes", 3800, 1));
            items.add(new LambdaFunctionForGrandTotalOfCart.Item(3, "pants", 1500, 3));
            items.add(new LambdaFunctionForGrandTotalOfCart.Item(4, "hat", 70, 5));
            items.add(new LambdaFunctionForGrandTotalOfCart.Item(5, "jacket", 1250, 1));
            float result = LambdaFunctionForGrandTotalOfCart.getCartTotal(items);
            System.out.println(result);
        }
    }
}
