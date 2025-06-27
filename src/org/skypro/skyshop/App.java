package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        SimpleProduct apple = new SimpleProduct("Яблоки", 50);
        SimpleProduct orange = new SimpleProduct("Апельсины", 90);
        SimpleProduct watermelon = new SimpleProduct("Арбуз", 75);
        SimpleProduct melon = new SimpleProduct("Дыня", 80);
        SimpleProduct strawberry = new SimpleProduct("Клубника", 110);
        SimpleProduct raspberry = new SimpleProduct("Малина", 120);
        SimpleProduct blueberries = new SimpleProduct("Черника", 150);

        DiscountedProduct nutMixture = new DiscountedProduct("Смесь орехов", 100, 20);
        DiscountedProduct yogurt = new DiscountedProduct("Йогурт", 80, 15);

        FixPriceProduct spoonDisposable = new FixPriceProduct("Ложка одноразовая");
        FixPriceProduct plugDisposable = new FixPriceProduct("Вилка одноразовая");
        FixPriceProduct paperСup = new FixPriceProduct("Стакан бумажный");
        FixPriceProduct paperPlate = new FixPriceProduct("Тарелка бумажная");

        System.out.println();
        ProductBasket basket = new ProductBasket();
        basket.addProductBasket(apple);
        basket.addProductBasket(nutMixture);
        basket.addProductBasket(yogurt);
        basket.addProductBasket(paperPlate);
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
        basket3.addProductBasket(spoonDisposable);
        basket3.addProductBasket(plugDisposable);
        basket3.addProductBasket(paperСup);
        basket3.addProductBasket(paperPlate);
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

        System.out.println();

        SearchEngine searchEngine = new SearchEngine(20);

        searchEngine.add(apple);
        searchEngine.add(orange);
        searchEngine.add(watermelon);
        searchEngine.add(melon);
        searchEngine.add(strawberry);
        searchEngine.add(raspberry);
        searchEngine.add(blueberries);
        searchEngine.add(nutMixture);
        searchEngine.add(yogurt);
        searchEngine.add(spoonDisposable);
        searchEngine.add(plugDisposable);
        searchEngine.add(paperСup);
        searchEngine.add(paperPlate);

        Article article1 = new Article("ЯБЛОКИ", "Яблоки содержат железо.");
        Article article2 = new Article("ЧЕРНИКА", "Цвет черники синий.");
        Article article3 = new Article("СТАКАН БУМАЖНЫЙ", "Бумажный стакан в дороге незаменимая вещь.");

        searchEngine.add(article1);
        searchEngine.add(article2);
        searchEngine.add(article3);

        Searchable[] searched1 = searchEngine.search("Яблоки");
        Searchable[] searched2 = searchEngine.search("Стакан бумажный");
        Searchable[] searched3 = searchEngine.search("Цвет черники синий");


        System.out.println(Arrays.toString(searched1));
        System.out.println(Arrays.toString(searched2));
        System.out.println(Arrays.toString(searched3));
    }
}