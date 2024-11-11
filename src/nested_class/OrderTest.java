package nested_class;

import java.time.LocalDate;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order(1, "Order", LocalDate.now());

        Order.Item item1 = order.new Item(300, "Item1", 30.0, 2.0);
        Order.Item item2 = order.new Item(300, "JOGOBELLA", 30.0, 2.0);


        item1.print();
        item2.print();


        Order order2 = new Order(2, "Order2", LocalDate.now());
        Order.Item item3 = order2.new Item(400, "Jogobella", 40.0, 3.0);
        item3.print();


        class Local {
            public void test() {
                System.out.println("Test");
            }
        }

        new Local().test();

        //
        Order orderX = new Order() {
            @Override
            public double discount() {
                return 1.00;
            }
        };

        Order orderBF = new BlackFridayOrder();

    }
}








