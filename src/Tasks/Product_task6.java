package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Product_task6 {
    private String name;
    private int quantity;
    private double price;
    List<Product_task6> products = new ArrayList<Product_task6>();

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

    public void biggestQuantity(String name, int quantity) {
        products.add(new Product_task6());
    };
/*
    public int mostFrequent() {

    }
*/
    @Override
    public String toString() {
        return "[name : " + name +
                ", quantity : " + quantity +
                ", price : " + price +
                /*", salary = " + this.salary() +
                ", bonuses = " + this.bonuses() +
                ", totalSum = " + this.totalSum() +*/ "]";
    }

    public static void main(String[] args) {

        Product_task6 product1 = new Product_task6("bananas", 5, 22.50);
        Product_task6 product2 = new Product_task6("bread", 1, 10.50);
        Product_task6 product3 = new Product_task6("tomatoes", 3, 25.50);
        Product_task6 product4 = new Product_task6("chicken", 1, 76.50);

        System.out.println(product1);

    }
}

