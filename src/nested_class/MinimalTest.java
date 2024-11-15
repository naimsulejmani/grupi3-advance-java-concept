package nested_class;

public class MinimalTest {
    public static void main(String[] args) {
        Minimal<Integer> integerMinimal = new Minimal<Integer>() {
            @Override
            public Integer min(Integer first, Integer second) {
                return first.compareTo(second) <= 0 ? first : second;
            }
        };

        Minimal<Double> doubleMinimal = Math::min;

        System.out.println(integerMinimal.min(100, 200));
        System.out.println(integerMinimal.min(200, 100));


        Minimal<String> stringMinimal = new Minimal<String>() {
            @Override
            public String min(String first, String second) {
                return first.compareTo(second) <= 0 ? first : second;
            }
        };

        System.out.println(stringMinimal.min("Hello", "World"));
        System.out.println(stringMinimal.min("World", "Hello"));

    }
}
