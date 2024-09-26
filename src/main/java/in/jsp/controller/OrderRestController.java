package in.jsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.jsp.model.Order;
import in.jsp.service.OrderService;

@RestController
public class OrderRestController {

	
	@Autowired
	private OrderService service;
	
	@PostMapping("/order")
	public String createOrder(@RequestBody Order order) {
		String msg=service.addMessage(order);
		return msg;
	}
}
