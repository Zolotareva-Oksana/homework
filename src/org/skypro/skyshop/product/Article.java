package org.skypro.skyshop.product;

public class Article implements Searchable {
    String title;
    String text;

    public Article(String title, String text) {
        this.title = title;
        this.text = text;
    }

    @Override
    public String toString() {
        return title + ": " + text;
    }

    @Override
    public String searchTerm() {
        return toString();
    }

    @Override
    public String productType() {
        return "ARTICLE";
    }

    @Override
    public String objectName() {
        return "";
    }
}