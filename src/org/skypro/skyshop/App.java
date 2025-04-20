package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product apple = new Product("Яблоки", 50);
        Product orange = new Product("Апельсины", 90);
        Product watermelon = new Product("Арбуз", 75);
        Product melon = new Product("Дыня", 80);
        Product strawberry = new Product("Клубника", 110);
        Product raspberry = new Product("Малина", 120);
        Product blueberries = new Product("Черника", 150);

        System.out.println();
        ProductBasket basket = new ProductBasket();
        basket.addProductBasket(apple);
        basket.printBasket();
        System.out.println();

        ProductBasket basket1 = new ProductBasket();
        basket1.addProductBasket(orange);
        basket1.addProductBasket(watermelon);
        basket1.addProductBasket(melon);
        basket1.addProductBasket(strawberry);
        basket1.addProductBasket(raspberry);
        basket1.addProductBasket(blueberries);
        System.out.println();

        ProductBasket basket2 = new ProductBasket();
        basket2.addProductBasket(strawberry);
        basket2.addProductBasket(raspberry);
        basket2.addProductBasket(blueberries);
        basket2.printBasket();
        System.out.println();

        ProductBasket basket3 = new ProductBasket();
        basket3.addProductBasket(blueberries);
        basket3.addProductBasket(watermelon);
        basket3.addProductBasket(blueberries);
        basket3.addProductBasket(blueberries);
        System.out.println("Общая стоимость корзины составила: " + basket3.totalCostBasket() + " руб.");
        System.out.println();

        ProductBasket basket4 = new ProductBasket();
        basket4.addProductBasket(apple);
        basket4.addProductBasket(apple);
        basket4.addProductBasket(apple);

        if (basket4.containsProductWithName("Черника")) {
            System.out.println("Продукт найден!");
        } else {
            System.out.println("Продукт не найден!");
        }
        System.out.println();

        if (basket4.containsProductWithName("Яблоки")) {
            System.out.println("Продукт найден!");
        } else {
            System.out.println("Продукт не найден!");
        }
        System.out.println();

        basket4.clearBasket();
        basket4.printBasket();
        System.out.println();

        System.out.println("Общая стоимость корзины составила: " + basket4.totalCostBasket() + " руб.");
        System.out.println();

        if (basket4.containsProductWithName("Яблоки")) {
            System.out.println("Продукт найден!");
        } else {
            System.out.println("Продукт не найден!");
        }
    }
}
