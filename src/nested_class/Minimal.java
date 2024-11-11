package nested_class;

@FunctionalInterface
public interface Minimal<T extends Comparable<T>> {
    public T min(T first, T second);
}
