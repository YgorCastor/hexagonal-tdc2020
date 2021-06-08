package com.tdc.java.shipping.adapters.output.databases.inmemory;

import com.tdc.java.shipping.core.commands.FetchShippingProductCommand;
import com.tdc.java.shipping.core.commands.SaveShippingProductCommand;
import com.tdc.java.shipping.core.models.Product;
import com.tdc.java.shipping.core.ports.output.FetchShippingForProduct;
import com.tdc.java.shipping.core.ports.output.SaveShippedProduct;

import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class ShippedInMemoryRepository implements FetchShippingForProduct, SaveShippedProduct {

    private final ConcurrentHashMap<UUID, Product> products = new ConcurrentHashMap<>();

    @Override
    public Optional<Product> with(FetchShippingProductCommand command) {
        return Optional.ofNullable(products.get(command.productId()));
    }

    @Override
    public void save(SaveShippingProductCommand command) {
        products.put(command.product().id(), command.product());
    }
}
