package com.tdc.java.shipping.core.commands;

import com.tdc.java.shipping.core.models.Product;

import java.util.UUID;

public record SaveShippingProductCommand(UUID messageId, Product product) {
}
