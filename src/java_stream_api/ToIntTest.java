package java_stream_api;

import java.util.Arrays;
import java.util.stream.Stream;

public class ToIntTest {
    public static void main(String[] args) {
        int sum = Stream.of("NAIM", "MESSI", "RONALDO", "ADNAN")
                .mapToInt(String::length)
                .peek(System.out::println)
                .filter(i -> i > 4)
                .sum();

        System.out.println(sum);
        String[] names = {"Naim", "Messi", "Ronaldo", "Adnan"};
        sum = Arrays.stream(names)
                .mapToInt(String::length)
                .peek(System.out::println)
                .filter(i -> i > 4)
                .sum();


    }
}
