package com.controlmatic.posclient.models.poswebservice;

public class WebServiceTest {
    public static void main(String[] args){
        WebServiceAdapter wsa = new WebServiceAdapter();
        ProductPrice pr = wsa.getPrice(123123123123L);
        System.out.println(pr.barcode);
        System.out.println(pr.price);
    }
}