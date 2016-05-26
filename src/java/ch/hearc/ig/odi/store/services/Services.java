/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.store.services;

import ch.hearc.ig.odi.store.business.Catalog;
import ch.hearc.ig.odi.store.business.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stephane.grangier
 */
public class Services {
    
    Catalog catalog;
    List<Product> products;
    

    public Services() {
        catalog = new Catalog("Migros");
        products = new ArrayList<Product>();
        
        Product p1 = new Product("1", "Pain", 2.20f);
        Product p2 = new Product("1", "Legume", 3.20f);
        Product p3 = new Product("1", "Viande", 25.50f);
        Product p4 = new Product("1", "Boisson", 1.5f);
        
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        
        
        catalog.setListProduct(null);

        
    }

    public List<Product> getProducts() {
        return products;
    }
    
   
    
    
}
