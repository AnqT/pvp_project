package com.controlmatic.posclient.models.cashbox;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class CashBoxAdapter {

    Client client;
    
    public CashBoxAdapter(){
        client = ClientBuilder.newClient();
    }
    
    public String getStatus(){
        return client.target("http://localhost:9001/cashbox/status")
                        .request(MediaType.TEXT_PLAIN)
                        .get(String.class);
    }
    
    public void openCashbox(){
        client.target("http://localhost:9001/cashbox/open")
                .request()
                .post(null);
    }
}
