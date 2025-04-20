package org.skypro.skyshop.product;

public class Product {
    private final String name;
    private final int price;

    public Product(String name, int price) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Наименование продукта не должно быть пустым.");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Цена продукта должна быть больше нуля.");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": " + price + " руб.";
    }
}