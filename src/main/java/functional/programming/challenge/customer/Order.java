package functional.programming.challenge.customer;

import java.time.LocalDate;
import java.util.Set;

public class Order {

    private Integer id;
    private LocalDate orderDate;
    private Customer customer;
    Set<Product> products;

    public Integer getId() {
        return id;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }
}
