package functional.programming.challenge.customer;

import java.util.Set;

public class Product {
    private String name;
    private String category;
    private final Double price;
    private Set<Order> orders;

    public Product(String name, String category, Double price, Set<Order> orders) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.orders = orders;
    }

    public Product withPrice(Double price){
        return new Product(this.name, this.category, price, this.orders);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrice() {
        return price;
    }
}
