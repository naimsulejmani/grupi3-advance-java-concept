package nested_class;

public class NewtonForcableTest {
    public static void main(String[] args) {
        NewtonForcable newtonTest = (m, a) -> m * a;

        double vlera = newtonTest.calculateForce(10.9, 9.81);
        System.out.println(vlera);

        NewtonForcable aaa = NewtonForcableTest::shumezo;
    }

    public static double shumezo(double a1, double a2) {
        return a1 * a2;
    }
}
