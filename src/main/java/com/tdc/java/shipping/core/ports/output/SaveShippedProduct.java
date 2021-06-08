package com.tdc.java.shipping.core.ports.output;

import com.tdc.java.shipping.core.commands.SaveShippingProductCommand;

public interface SaveShippedProduct {
    void save(SaveShippingProductCommand command);
}
