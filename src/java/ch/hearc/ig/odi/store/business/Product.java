/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.store.business;

/**
 *
 * @author stephane.grangier
 */
public class Product {
    
    private String productId;
    private String name;
    private Float price;

    public Product(String productId, String name, Float price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return productId;
    }

    public void setId(String id) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
    
    
}
