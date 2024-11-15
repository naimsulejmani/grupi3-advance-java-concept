package nested_class;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExamples {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Joe");
        names.add("Alice");

//        Predicate<String> startWithJ = name -> name.startsWith("J");
//        Predicate<String> endWithE = name -> name.endsWith("e");
//
//        names.removeIf(startWithJ.and(endWithE));
//
//
//        System.out.println(names);
//        names.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.equalsIgnoreCase("Jane");
//            }
//        });
//        System.out.println(names);
//
//        names.removeIf(name -> name.equalsIgnoreCase("joe"));
//
//
        names.forEach(System.out::println);



    }
}











