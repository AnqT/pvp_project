package com.controlmatic.posclient.models.cardreader;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

public class CardReaderAdapter {
    
    Client client;
    
    public CardReaderAdapter(){
        client = ClientBuilder.newClient();
    }
    
    public String getStatus(){
        return client.target("http://localhost:9002/cardreader/status")
                        .request(MediaType.TEXT_PLAIN)
                        .get(String.class);
    }
    
    public void abortPayment(){
        client.target("http://localhost:9002/cardreader/abort")
                .request()
                .post(null);
    }
    
    public void resetCardReader(){
        client.target("http://localhost:9002/cardreader/reset")
                .request()
                .post(null);
    }
    
    public CombinedCardResult getResult(){
        return client.target("http://localhost:9002/cardreader/result")
                .request(MediaType.APPLICATION_XML)
                .get(CombinedCardResult.class);
    }
    
    public void waitForPayMent(double amount){
        
        Form form = new Form();     
        form.param("amount", String.valueOf(amount));
        
        client.target("http://localhost:9002/cardreader/waitForPayment")
              .request()
              .post(Entity.form(form));
    }  
}