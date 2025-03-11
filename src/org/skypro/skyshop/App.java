package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {

        ProductBasket basket = new ProductBasket();

        Product product1 = new Product("Cucumber", 200);
        Product product2 = new Product("Apple", 100);
        Product product3 = new Product("Orange", 150);
        Product product4 = new Product("Meat", 350);
        Product product5 = new Product("Milk", 130);
        Product product6 = new Product("Cheese", 160);

        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);
        basket.printBasket();

        basket.addProduct(product6);
        basket.printBasket();

        System.out.println("Стоиимость корзины: " + basket.getTotalCosts());

        String searchProduct1 = "Cucumber";
        System.out.println("Поиск продукта: " + searchProduct1 + basket.constainsProduct(searchProduct1));

        String searchProduct2 = "Melon";
        System.out.println("Поиск продукта: " + searchProduct2 + basket.constainsProduct(searchProduct2));

        basket.clearBasket();

        System.out.println("Общая стоимость: " + basket.getTotalCosts());

        String searchProduct3 = "Apple";
        System.out.println("Поиск продукта: " + searchProduct3 + " - " + basket.constainsProduct(searchProduct3));
    }
}
