package com.controlmatic.posclient.models.productcatalog;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class ProductCatalogAdapter {
    
    Client client;
    
    public ProductCatalogAdapter(){
        client = ClientBuilder.newClient();
    }
    
    public Product findProductByBarCode(long barcode){
        return client.target("http://localhost:9003/rest/findByBarCode/"+barcode)
                        .request(MediaType.APPLICATION_XML)
                        .get(Product.class);
    }
    
    public Products findProductsByName(String name){
        return client.target("http://localhost:9003/rest/findByName/"+name)
                .request(MediaType.APPLICATION_XML)
                .get(Products.class);     
    }
    
    public Products findProductsByKeyword(String keyword){
        return client.target("http://localhost:9003/rest/findByKeyword/"+keyword)
                .request(MediaType.APPLICATION_XML)
                .get(Products.class);     
    }  
}