package com.delivery.services;

import com.delivery.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double amount = order.getBasic();

        if (amount < 100.0) return 20.0;
        if (amount < 200.0) return 12.0;
        return 0.0;
    }

}
