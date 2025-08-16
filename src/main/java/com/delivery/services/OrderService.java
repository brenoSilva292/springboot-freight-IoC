package com.delivery.services;


import com.delivery.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double basic = order.getBasic();
        double discount = basic * order.getDiscount() / 100.0;
        double shipping = shippingService.shipment(order);
        return basic - discount + shipping;
    }

}

