package org.skypro.skyshop.product;

public class DiscountedProduct extends Product {
    private double basePrice;
    private double discountPercentage;

    public DiscountedProduct(String name, double basePrice, int discountPercentage) {
        super(name);
        this.basePrice = basePrice;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public int getPrice() {
        return (int) (basePrice * ((100 - discountPercentage)/100));
    }

    @Override
    public boolean isSpecial() {
        return true;
    }

    @Override
    public String toString() {
        return getName() + ": " + basePrice + " руб." + " (-" + discountPercentage + " %).";
    }

}
