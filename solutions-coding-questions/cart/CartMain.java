

class User {
    private int id;
    private String name;

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

    
}

class Item {
    
    private int id;
    private String name;
    private double price;
    
    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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
}

class Cart {
    private User user;
    private Item[] items;
    private double totalPrice;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Item[] getItems() {
        return items;
    }
    public void setItems(Item[] items) {
        this.items = items;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

public class CartMain {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("abc");

        Cart cart = new Cart();
        cart.setUser(user);

        Item[] items = new Item[20];
        items[0] = new Item(1, "abc", 35.90);
        items[1] = new Item(2, "pqr", 35);
        items[2] = new Item(1, "xyz", 20);

        cart.setItems(items);
    }
}
