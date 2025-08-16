package com.delivery.delivery;

import com.delivery.entities.Order;
import com.delivery.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.delivery.delivery",   // pacote da classe principal
		"com.delivery.services",   // pacote dos serviços
		//"com.delivery.entities"    // pacote das entidades
})
public class DeliveryApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DeliveryApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f%n", orderService.total(order));

	}

}
