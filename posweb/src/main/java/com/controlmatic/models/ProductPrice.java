package com.controlmatic.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="product_prices")
@XmlRootElement(name="productprice")
public class ProductPrice implements Serializable {
    @Id
    @Column(name="id")
    private int id;
    
    @Column(name="barcode")
    private long barcode;
    
    @Column(name="price")
    private double price;
    
    public ProductPrice(){
        
    }
    
    public ProductPrice(int _id, long _barcode, double _price){
        this.id = _id;
        this.barcode = _barcode;
        this.price = _price;
    }

    public long getBarcode() {
        return barcode;
    }

    public void setBarcode(long barcode) {
        this.barcode = barcode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }   
}
