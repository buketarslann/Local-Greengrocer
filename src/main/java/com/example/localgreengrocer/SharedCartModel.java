package com.example.localgreengrocer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SharedCartModel {
    private final ObservableList<String> cartItems = FXCollections.observableArrayList();

    public ObservableList<String> getCartItems() {
        return cartItems;
    }

    public void addItemToCart(String item) {
        cartItems.add(item);
    }
}