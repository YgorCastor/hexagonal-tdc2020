package com.tdc.java.shipping.core.ports.output;

import com.tdc.java.shipping.core.commands.FetchShippingProductCommand;
import com.tdc.java.shipping.core.models.Product;

import java.util.Optional;

public interface FetchShippingForProduct {
    Optional<Product> with(FetchShippingProductCommand command);
}
