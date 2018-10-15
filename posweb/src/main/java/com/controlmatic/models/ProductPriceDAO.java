package com.controlmatic.models;

import java.util.List;
import org.hibernate.Session;

public class ProductPriceDAO {

    public ProductPriceDAO() {
        Session s = SessionUtil.getSession();
    }

    public ProductPrice getPrice(long barcode) {
        Session session = SessionUtil.getSession();
        ProductPrice price = null;
        // Begin the transaction.
        session.beginTransaction();

        // Retrieve the prices.
        List<ProductPrice> prices = session
                .createQuery("from ProductPrice p where p.barcode=" + barcode)
                .getResultList();

        session.getTransaction().commit();

        session.close();

        if(!prices.isEmpty()){
            price = prices.get(0);
        }   
        return price;
    }
}
