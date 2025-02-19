package consultation_22.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private int id;
    private User user;
    private List<Product> items;
    private double totalPrice;

    public Cart(int id, User user) {
        this.id = id;
        this.user = user;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
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

    public List<Product> getItems() {
        return items;
    }

    public void addItems(Product product) {
        items.add(product);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void recalculateTotalPrice() {
        this.totalPrice = items.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", user=" + user.getLogin() +
                ", items=" + items +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
