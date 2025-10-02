package lesson5;

import java.util.Comparator;
import java.util.Objects;

public class Product {
    private int Price;
    private String Name;
    private String Category;

    public Product(int price, String name, String category) {
        this.Price = price;
        this.Name = name;
        this.Category = category;
    }

    public Product(String name, String category, int price) {
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        this.Price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Price == product.Price && Objects.equals(Name, product.Name) && Objects.equals(Category, product.Category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Price, Name, Category);
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + Price +
                ", Name='" + Name + '\'' +
                ", Category='" + Category + '\'' +
                '}';
    }
}
