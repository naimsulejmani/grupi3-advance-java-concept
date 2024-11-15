package nested_class;

import java.util.Comparator;
import java.util.function.Predicate;

public class MinimalTest1 {
    public static void main(String[] args) {
        Minimal<Integer> integerMinimal = (first, second) -> {
            if (first.compareTo(second) <= 0) {
                return first;
            } else {
                return second;
            }
        };

        Comparator<Integer> comparator = (o1, o2) -> o1 - o2;


        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isDoubleDigit = number -> number > 9 && number < 100;
        System.out.println(isEven.test(10));

        // shiko a eshte numry qift dhe dyshifrore
        System.out.println(isEven.and(isDoubleDigit).test(10));
        System.out.println(isEven.and(isDoubleDigit).test(6));
        System.out.println(isEven.negate().test(7));
    }
}








