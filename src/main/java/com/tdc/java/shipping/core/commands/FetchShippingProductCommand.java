package com.tdc.java.shipping.core.commands;

import java.util.UUID;

public record FetchShippingProductCommand(UUID productId) {
}
