package org.skypro.skyshop.product;

public interface Searchable {
    String searchTerm();           // Термин поиска
    String productType();          // Тип объекта
    String objectName();           // Имя объекта
    default String getStringRepresentation() {
        return objectName() + " — " + productType();
    }
}