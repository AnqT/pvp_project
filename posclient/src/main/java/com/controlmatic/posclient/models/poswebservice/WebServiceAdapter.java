package com.controlmatic.posclient.models.poswebservice;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class WebServiceAdapter {

    Client client;
    
    public WebServiceAdapter(){
        client = ClientBuilder.newClient();
    }
    
    public ProductPrice getPrice(long barcode){
        return client.target("http://localhost:8080/posweb/webapi/price/"+barcode)
                        .request(MediaType.APPLICATION_XML)
                        .get(ProductPrice.class);
    }
}
