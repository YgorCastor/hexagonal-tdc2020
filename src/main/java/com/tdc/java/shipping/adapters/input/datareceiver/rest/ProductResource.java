package com.tdc.java.shipping.adapters.input.datareceiver.rest;

import com.tdc.java.shipping.core.ShippingFacade;
import com.tdc.java.shipping.core.commands.ShipProductCommand;
import com.tdc.java.shipping.core.models.Product;
import com.tdc.java.shipping.core.ports.input.ShipProduct;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/hello-resteasy")
public class ProductResource implements ShipProduct {

    public final ShippingFacade shippingFacade;

    @Inject
    public ProductResource(ShippingFacade shippingFacade) {
        this.shippingFacade = shippingFacade;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void shipIt(ShipProductCommand command) {
        shippingFacade.shipProduct(new Product(command.productId(), command.productName(), command.destination()));
    }
}