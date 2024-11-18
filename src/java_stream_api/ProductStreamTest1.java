package java_stream_api;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductStreamTest1 {
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
        //p->p.getPrice()>1000;
        products.stream()
                .filter(p -> p.getPrice().compareTo(BigDecimal.valueOf(1000)) > 0)
                .forEach(p -> p.setDiscount(BigDecimal.valueOf(0.25)));


//        for(Product p:products){
//            if(p.getPrice().compareTo(BigDecimal.valueOf(1000))>0) {
//                p.setDiscount(BigDecimal.valueOf(0.25));
//            }
//        }

        System.out.println(products);


    }
}









