package pe.edu.utp.javarestfulsample.models;

import java.util.List;

public class JaxService {

    private ProductsEntity productsEntity;

    public ProductsEntity getProductsEntity(){

        if(productsEntity == null){

            productsEntity  = new ProductsEntity();

        }

        return productsEntity;
    }


    public List<Product> findAllProducts(){
        return  findAllProducts();


    }

    public Product findProductById(int id){
        return getProductsEntity().findById(id);
    }
}
