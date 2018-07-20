package Tasks;

public class Product_task6 {
    private String name;
    private int quantity;
    private double price;

    // - - - - getters - - - - - //

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    // - - - - setters - - - - - //

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // - - - - constructors - - - - - //

    public Product_task6() {
    }

    public Product_task6(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public static void main(String[] args) {

    }
}

