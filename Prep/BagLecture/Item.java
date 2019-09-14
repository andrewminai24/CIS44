package ClassAssignment;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item () {
        this("", 0.0, 0);
    }

    public Item (String name) {
        this(name, 0, 0);
    }

    public Item (String name, double price) {
        this(name, price, 0);
    }

    public Item (Item item) {
        this(item.getName(), item.getPrice(), item.getQuantity());
    }

    public Item (String name, double price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        if (price >= 0.0) {
            this.price = price;
        }

        else {
            this.price = 0.0;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        }

        else {
            this.quantity = 0;
        }
    }

    @Override
    public String toString() {
        return String.format(
                "Name: %s\nPrice: $%.2f\nQuantity: %d",
                name,
                price,
                quantity
        );
    }
}