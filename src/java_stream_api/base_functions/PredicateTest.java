package java_stream_api.base_functions;

import java_stream_api.Drink;
import java_stream_api.Product;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Iphone 16 PRO", BigDecimal.valueOf(1600.99), 100,
                BigDecimal.valueOf(0.10), LocalDate.now().plusYears(5)));
        products.add(new Product(2, "Iphone 16", BigDecimal.valueOf(1400.99), 100,
                BigDecimal.valueOf(0.10), LocalDate.now().plusYears(5)));
        products.add(new Product(3, "Iphone 15 PRO", BigDecimal.valueOf(1200.99), 100,
                BigDecimal.valueOf(0.10), LocalDate.now().plusYears(5)));
        products.add(new Product(4, "Iphone 15", BigDecimal.valueOf(1000.99), 100,
                BigDecimal.valueOf(0.10), LocalDate.now().plusYears(5)));
        products.add(new Product(5, "Iphone 14 PRO", BigDecimal.valueOf(800.99), 100,
                BigDecimal.valueOf(0.10), LocalDate.now().plusYears(5)));
        products.add(new Product(6, "Iphone 14", BigDecimal.valueOf(700.99), 100,
                BigDecimal.valueOf(0.10), LocalDate.now().plusYears(5)));
        products.add(new Product(7, "Iphone 13 PRO", BigDecimal.valueOf(600.99), 100,
                BigDecimal.valueOf(0.10), LocalDate.now().plusYears(5)));
        products.add(new Product(8, "Iphone 13", BigDecimal.valueOf(500.99), 100,
                BigDecimal.valueOf(0.10), LocalDate.now().plusYears(5)));


        Predicate<Product> proPredicate =
                p -> p.getName().toLowerCase().contains("pro");
        Predicate<Product> pricePredicate1000 =
                p -> p.getPrice().compareTo(BigDecimal.valueOf(1000)) > 0;

        var filteredProdcuts = products.stream().filter(proPredicate).toList();

        Function<Product, Drink> productToDrinkFunc =
                p -> new Drink(p.getId(), p.getName(),
                        p.getPrice().toBigInteger().doubleValue());

        filteredProdcuts.stream().map(productToDrinkFunc).forEach(System.out::println);


    }
}
