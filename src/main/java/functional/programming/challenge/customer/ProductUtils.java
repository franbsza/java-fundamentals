package functional.programming.challenge.customer;

import java.util.*;
import java.util.stream.Collectors;

public class ProductUtils {

    List<Product> getBooksMoreExpensiveThan100(List<Product> products){
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Book"))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());
    }

    List<Product> discount10PercentForToys(List<Product> products){
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Toy"))
                .map(p -> p.withPrice(p.getPrice() * 0.9))
                .collect(Collectors.toList());
    }

    Product getCheapestBook(List<Product> products){
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Book"))
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);
    }

    DoubleSummaryStatistics getStatistics(List<Product> products){
        return products.stream()
                .filter(o -> o.getCategory().equalsIgnoreCase("Books"))
                .mapToDouble(Product::getPrice)
                .summaryStatistics();
    }

    Map<String, List<String>> getProductsNamesByCategory(List<Product> products){
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory ,
                        Collectors.mapping(Product::getName, Collectors.toList())));
    }

    Map<String, Optional<Product>> getExpensiveProductByCategory(List<Product> products){
        return products.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory ,
                        Collectors.maxBy(Comparator.comparingDouble(Product::getPrice))
                ));
    }
}
