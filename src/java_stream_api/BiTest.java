package java_stream_api;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

public class BiTest {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate = (s, i) -> s.length() == i;

        String s = "Hello";
        int i = 5;
        System.out.println(biPredicate.test(s, i));

        Map<String, Integer> map = new HashMap<>();
        map.put("Naim", 5);
        map.put("Messi", 5);
        map.put("Ronaldo", 7);

        //BiConsumer
        map.forEach((key, value) -> System.out.println(key + " " + value));
//
//        for(Map.Entry<String, Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        Product p = new Product();

        Consumer<String> consumeString = p::setName;


    }
}
