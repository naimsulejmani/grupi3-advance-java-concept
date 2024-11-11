package nested_class;

import java.time.LocalDate;

public class Order {
    private int id;
    private String name;
    private LocalDate date;


    public Order(int id, String name, LocalDate date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public double discount() {
        return 0.0;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public class Item {
        private int id;
        private String name;
        private double price;
        private double quantity;


        public Item(int id, String name, double price, double quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public Item() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public double getQuantity() {
            return quantity;
        }

        public void setQuantity(double quantity) {
            this.quantity = quantity;
        }

        public void print() {
            System.out.println("Order: " + Order.this.id + " " + Order.this.name + " " + Order.this.date);
            System.out.println("Item: " + this.id + " " + this.name + " " + this.price + " " + this.quantity);
        }
    }


}














