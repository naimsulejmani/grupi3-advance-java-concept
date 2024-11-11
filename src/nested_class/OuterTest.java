package nested_class;

public class OuterTest {
    public static void main(String[] args) {
        Outer.InnerStatic innerStatic = new Outer.InnerStatic(1, 2);
        System.out.println(innerStatic.getX());
        System.out.println(innerStatic.getY());

        Outer outer = new Outer(1, "Outer");
        System.out.println(outer.getId());
        System.out.println(outer.getName());

        Outer.Inner inner = outer.new Inner(3, 4);
        System.out.println(inner.getX());
        System.out.println(inner.getY());

    }
}
