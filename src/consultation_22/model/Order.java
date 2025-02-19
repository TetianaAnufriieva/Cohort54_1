package consultation_22.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private User user;
    private List<Product> products;
    private double totalAmount;
    private String status;

    public Order(int id, User user) {
        this.id = id;
        this.user = user;
        this.products = new ArrayList<>();
        this.totalAmount = 0.0;
        this.status = "NEW";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
        recalculateTotalAmount();
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void recalculateTotalAmount() {
        this.totalAmount = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user=" + user.getLogin() +
                ", products=" + products +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
