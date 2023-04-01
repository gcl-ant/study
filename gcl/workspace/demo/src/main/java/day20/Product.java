package day20;

public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock){
        this.name =name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
