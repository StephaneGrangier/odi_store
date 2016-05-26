/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.store.business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author stephane.grangier
 */
public class Catalog {
    
    private String catalogId;
    private  List<Product> listProduct;
    
     public Catalog(String catalogId) {
        listProduct = new ArrayList<Product>();
        this.catalogId = catalogId;

    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }
     
     
    
}
