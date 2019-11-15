
package com.carlosehr.commercialsystem.models;

import java.util.List;

/**
 *
 * @author Carlos Hoyos
 */
public class Category {
    private long category_id;
    private String name;
    private List<Product> products;

    public Category() {
    }

    public Category(long category_id) {
        this.category_id = category_id;
    }
    
    

    public Category(long category_id, String name) {
        this.category_id = category_id;
        this.name = name;
    }
    
    

    public long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(long category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    
    
}
