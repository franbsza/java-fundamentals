package functional.programming.challenge.customer;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrderUtils {

    List<Order> getOrdersContainsBook(List<Order> orders) {
        return orders.stream()
                .filter(o ->
                        o.getProducts().stream()
                                .anyMatch(p -> p.getCategory().equalsIgnoreCase("Books"))
                ).collect(Collectors.toList());
    }

    List<Product> getProductsOrderedByCustomerTier2AndBetweenFebAndApril(List<Order> orders) {
        return orders.stream()
                .filter(o -> o.getCustomer().getTier() == 2)
                .filter(o -> o.getOrderDate().isAfter(LocalDate.of(2021, 2, 1)))
                .filter(o -> o.getOrderDate().isBefore(LocalDate.of(2021, 4, 1)))
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    List<Order> get3MostRecentOrders(List<Order> orders) {
        return orders.stream()
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    List<Product> getMarchOrderedProducts(List<Order> orders) {
        return orders.stream()
                .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 1)))
                .flatMap(o -> o.getProducts().stream())
                .distinct()
                .collect(Collectors.toList());
    }

    double getSumOrders(List<Order> orders) {
        return orders.stream()
                .filter(o -> o.getOrderDate().getMonth() == Month.FEBRUARY)
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();

    }

    OptionalDouble getAveragePaymentOrder(List<Order> orders) {
        return orders.stream()
                .filter(o -> o.getOrderDate().isEqual(LocalDate.of(2021, 3, 14)))
                .flatMap(o -> o.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .average();
    }

    Map<Integer, Integer> getCountProductsOnOrder(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.toMap(
                        Order::getId,
                        o -> o.getProducts().size()
                ));

    }

    Map<Customer, List<Order>> getOrdersByCustomer(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.groupingBy(Order::getCustomer));
    }

    Map<Order, Double> getOrderPrice(List<Order> orders) {
        return orders.stream()
                .collect(
                        Collectors.toMap(
                                Function.identity(),
                                order -> order.getProducts().stream()
                                        .mapToDouble(Product::getPrice).sum()
                        )
                );
    }

}
