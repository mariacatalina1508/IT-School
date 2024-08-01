package session_17_equals_hashcode_generics.challenge.challenge_5;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private String id;

    public Product(String name, double price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", id=" + id + "]";
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 899.99, "P12345");
        Product p2 = new Product("Apple watch", 699.99, "P12345");
        Product p3 = new Product("Tablet watch", 589.99, "P56879");

        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));

        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());
        System.out.println("p3 hashCode: " + p3.hashCode());

        System.out.println("p1 and p2 have the same hashCode: " + (p1.hashCode() == p2.hashCode()));

        p2.setId("P54321");

        System.out.println("\nAfter changing the id of p2:");
        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 hashCode: " + p1.hashCode());
        System.out.println("p2 hashCode: " + p2.hashCode());

        System.out.println("p1 and p2 have the same hashCode: " + (p1.hashCode() == p2.hashCode()));
    }
}
