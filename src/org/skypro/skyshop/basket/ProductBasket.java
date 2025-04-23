package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private static final int MAX_COMPLETION = 5;
    private static Product[] products = new Product[MAX_COMPLETION];
    private int quantityProductsBasket;

    public ProductBasket() {
        this.products = new Product[MAX_COMPLETION];
        this.quantityProductsBasket = 0;
    }

    public int getQuantityProductsBasket() {
        return quantityProductsBasket;
    }

    public void addProductBasket(Product product) {
        if (quantityProductsBasket >= MAX_COMPLETION) {
            System.out.println("Корзина заполнена, невозможно добавить продукт.");
//            но я бы предпочла в код добавить эту строку: throw new IllegalArgumentException("Корзина заполнена, невозможно добавить продукт.");
            return;
        }
        products[quantityProductsBasket++] = product;
    }

    public int totalCostBasket() {
        int totalCost = 0;
        for (int i = 0; i < quantityProductsBasket; i++) {
            if (products[i] != null) {
                totalCost += products[i].getPrice();
            }
        }
        return totalCost;
    }

    public void printBasket() {
        if (quantityProductsBasket == 0) {
            System.out.println("Корзина пуста.");
            return;
        }

        int totalCost = totalCostBasket();
        int specialCount = countSpecialProducts();
        for (int i = 0; i < quantityProductsBasket; i++) {
            if (products[i] != null) {
                System.out.println(products[i].toString());
            }
        }
        System.out.println("Итого: " + totalCost + " руб.");
        System.out.println("Специальных товаров: " + specialCount + " ед.");
    }

    private int countSpecialProducts() {
        int specialCount = 0;
        for (int i = 0; i < quantityProductsBasket; i++) {
            if (products[i].isSpecial()) {
                specialCount++;
            }
        }
        return specialCount;
    }

    public boolean containsProductWithName(String productName) {
        for (int i = 0; i < quantityProductsBasket; i++) {
            if (products[i] != null && products[i].getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    public void clearBasket() {
        for (int i = 0; i < quantityProductsBasket; i++) {
            products[i] = null;
        }
        quantityProductsBasket = 0;
    }
}