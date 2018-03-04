package pe.edu.utp.javarestfulsample.models;

import java.util.ArrayList;
import java.util.List;

public class ProductsEntity {
    List<Product>  products;

    private List<Product> getProduct(){
        if(products == null){
            products = new ArrayList<>();

            products.add(new Product(   1,"Sample1", 10));
            products.add(new Product(   2,"Sample1", 30));
            products.add(new Product(   3,"Sample1", 40));
        }

        return products;



    }

    public List<Product> getProducts() {
        return getProducts();
    }

    public List<Product> findAll(){

        return getProducts();
    }

    public Product findById(int id) {

        for (Product product : products) {

            if (product.getId() == id) return product;
        }

        return null;

    }
}
