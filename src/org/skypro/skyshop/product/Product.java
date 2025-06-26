package org.skypro.skyshop.product;

public abstract class Product implements Searchable{
    private final String name;

    public Product(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Наименование продукта не должно быть пустым.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract int getPrice();

    public abstract String toString();

    public abstract boolean isSpecial();

    public String searchTerm() {
        return name;
    }

    public String productType() {
        return "PRODUCT";
    }

    public String objectName() {
        return "";
    }
}