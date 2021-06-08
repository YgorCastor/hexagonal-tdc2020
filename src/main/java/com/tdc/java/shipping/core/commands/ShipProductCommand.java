package com.tdc.java.shipping.core.commands;

import java.util.UUID;

public record ShipProductCommand(UUID productId, String productName, String destination) {
}
