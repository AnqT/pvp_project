package com.controlmatic.posclient.models.poswebservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="productprice")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductPrice{
    long barcode;
    double price;
}