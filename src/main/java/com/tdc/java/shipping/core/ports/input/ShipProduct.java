package com.tdc.java.shipping.core.ports.input;

import com.tdc.java.shipping.core.commands.ShipProductCommand;

public interface ShipProduct {
    void shipIt(ShipProductCommand command);
}
