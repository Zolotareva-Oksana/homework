package org.skypro.skyshop.product;

import java.util.Arrays;

public class SearchEngine {
    private Searchable[] items;
    private int size;

    public SearchEngine(int length) {
        items = new Searchable[length];
        size = 0;
    }

    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int count = 0;
        for (int i = 0; i < size && count < 5; i++) {
            Searchable currentItem = items[i];
            if (currentItem != null &&
                    currentItem.searchTerm().toLowerCase().contains(query.toLowerCase())) {
                results[count++] = currentItem;
                if (count >= 5) {
                    break;
                }
            }
        }
        return Arrays.copyOf(results, count); // Возвращаем очищенный массив без null-значений
    }

    public void add(Searchable item) {
        if (size < items.length) {
            items[size++] = item;
        }
    }
}