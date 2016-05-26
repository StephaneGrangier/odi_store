/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.store.business;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author stephane.grangier
 */
public class Basket {

    private Map<Product, Integer> detail;

    public Basket() {
        this.detail = new HashMap();
    }

    public Map<Product, Integer> getDetail() {
        return detail;
    }

    public void setDetail(Map<Product, Integer> detail) {
        this.detail = detail;
    }

    public void addProduct(Product product, Integer quantity) {
        if (!isProductInBasket(product)) {
            detail.put(product, quantity);
        } else {
            setQuantityProduct(product, quantity);
        }

    }

    public void setQuantityProduct(Product product, Integer quantity) {
        detail.replace(product, quantity);
    }

    public boolean isProductInBasket(Product product) {
        return detail.containsKey(product);
    }

}
