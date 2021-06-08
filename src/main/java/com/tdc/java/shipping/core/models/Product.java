package com.tdc.java.shipping.core.models;

import java.util.UUID;

public record Product(UUID id, String name, String destination) {
}
