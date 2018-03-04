package pe.edu.utp.javarestfulsample.models;

public class Product {
    private int id;
    private String name;
    private int stock;

    public Product(int id, String name, int stock) {
        this.setId(id);
        this.setName(name);
        this.setStock(stock);
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
