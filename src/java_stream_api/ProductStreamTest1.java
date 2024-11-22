package java_stream_api;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductStreamTest1 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Iphone 16 PRO", BigDecimal.valueOf(-1600.99), 100,
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
        //p->p.getPrice()>1000;
        products.stream()
                .filter(p -> p.getPrice().compareTo(BigDecimal.valueOf(1000)) > 0)
                .forEach(p -> p.setDiscount(BigDecimal.valueOf(0.25)));


//        for(Product p:products){
//            if(p.getPrice().compareTo(BigDecimal.valueOf(1000))>0) {
//                p.setDiscount(BigDecimal.valueOf(0.25));
//            }
//        }

//        System.out.println(products);


        products.stream().filter(Predicate.isEqual(products.get(0))).forEach(System.out::println);


        UnaryOperator<Integer> vleraAbsolute = Math::abs;

        products.stream().mapToInt(p -> vleraAbsolute.apply(p.getPrice().intValue())).forEach(System.out::println);


       Optional<Drink> drinkOpt =  Stream.of(new Drink(-1, "Makiato", 1),
                        new Drink(2, "Espresso", 2),
                        new Drink(3, "Cappuccino", 3))
                .findAny();

       if(drinkOpt.isPresent()) {
           System.out.println(drinkOpt.get());
       }


        DoubleSummaryStatistics dss = Stream.of(new Drink(-1, "Makiato", 1),
                new Drink(2, "Espresso", 2),
                new Drink(3, "Cappuccino", 3)).collect(Collectors.summarizingDouble(Drink::getPrice));

        System.out.println(dss);
    }
}









