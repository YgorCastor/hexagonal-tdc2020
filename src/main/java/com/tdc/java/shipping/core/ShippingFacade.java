package com.tdc.java.shipping.core;

import com.tdc.java.shipping.core.commands.SaveShippingProductCommand;
import com.tdc.java.shipping.core.models.Product;
import com.tdc.java.shipping.core.ports.output.SaveShippedProduct;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.UUID;

@ApplicationScoped
public class ShippingFacade {

    private final SaveShippedProduct saveShippedProduct;

    @Inject
    public ShippingFacade(SaveShippedProduct saveShippedProduct) {
        this.saveShippedProduct = saveShippedProduct;
    }

    public void shipProduct(Product product) {
        saveShippedProduct.save(new SaveShippingProductCommand(UUID.randomUUID(), product));
    }
}
