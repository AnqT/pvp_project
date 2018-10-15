package com.controlmatic.posclient.models.productcatalog;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="product")
@XmlAccessorType(XmlAccessType.FIELD)
public class Product{
    @XmlAttribute(name="id")
    int id;
    long barCode;
    String name;
    double vat;
    @XmlElement(name="keyword")
    List<String> keywords;
}
