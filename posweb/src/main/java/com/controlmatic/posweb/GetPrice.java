package com.controlmatic.posweb;

import com.controlmatic.models.ProductPrice;
import com.controlmatic.models.ProductPriceDAO;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("price")
public class GetPrice {

    @GET
    @Path("{barcode}")
    @Produces(MediaType.APPLICATION_XML)
    public ProductPrice getIt(@PathParam("barcode") long barcode) {
        ProductPriceDAO dao = new ProductPriceDAO();
        return dao.getPrice(barcode);
    }
    
}
