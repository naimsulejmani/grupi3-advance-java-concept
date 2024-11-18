package java_stream_api;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private BigDecimal price;
    private int quantity;
    private BigDecimal discount;
    private LocalDate bestBefore;

    public Product(int id, String name, BigDecimal price, int quantity, BigDecimal discount, LocalDate bestBefore) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.bestBefore = bestBefore;
    }

    public Product() {

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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }

    public BigDecimal getDiscountedPrice() {
        //return price.doubleValue() * (1 - discount.doubleValue());
        return price.multiply(BigDecimal.ONE.subtract(discount));
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", bestBefore=" + bestBefore +
                '}';
    }
}












