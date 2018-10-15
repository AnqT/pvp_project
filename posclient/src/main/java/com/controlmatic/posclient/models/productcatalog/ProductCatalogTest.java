package com.controlmatic.posclient.models.productcatalog;

public class ProductCatalogTest {
    
    public static void main(String[] args){
        
        // Instantiating a new adapter.
        
        ProductCatalogAdapter productcatalog = new ProductCatalogAdapter();
        
        // Find the product with the barcode.
        
        Product product = productcatalog.findProductByBarCode(1);
        
        // Print the results.
        
        System.out.println(product.id);
        System.out.println(product.barCode);
        System.out.println(product.name);
        System.out.println(product.vat);
        System.out.println(product.keywords); 
    }
}
