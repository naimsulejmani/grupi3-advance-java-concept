package java_stream_api;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.ToDoubleFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        int suma = IntStream.generate(() -> new Random().nextInt(10))
                .peek(System.out::println)
                .takeWhile(i -> i != 3).sum();
        System.out.println(suma);


        Stream.of(new Drink(1, "Makiato", 1),
                        new Drink(2, "Espresso", 2),
                        new Drink(3, "Cappuccino", 3))
                .forEach(System.out::println);


        String[] names = {"Naim", "Amar", "Filan", "Fistek"};
        Arrays.stream(names).filter(s -> s.startsWith("F"))
                .forEach(System.out::println);


        double price = Stream.of(new Drink(1, "Makiato", 1),
                        new Drink(2, "Espresso", 2),
                        new Drink(3, "Cappuccino", 3))
                .parallel().mapToDouble(Drink::getPrice     ).sum();

        System.out.println(price);
        //.parallel().mapToDouble(d->d.getPrice()).sum();


    }
}
