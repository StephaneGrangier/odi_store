/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.store.bean;

import ch.hearc.ig.odi.store.business.Product;
import ch.hearc.ig.odi.store.services.Services;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

/**
 *
 * @author stephane.grangier
 */
@Named(value = "listCatalog")
@Dependent
public class listCatalog {

    @Inject
    Services services;

    /**
     * Creates a new instance of listCatalog
     */
    public listCatalog() {
        
    }

    public List<Product> getCatalog() {
        return services.getProducts();

    }

}
