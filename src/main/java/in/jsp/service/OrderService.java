package in.jsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.jsp.constant.AppConstants;
import in.jsp.model.Order;

@Service
public class OrderService {

	@Autowired
	private KafkaTemplate<String, Order>kafkaTemplate;
	
	public String addMessage(Order order) {
		kafkaTemplate.send(AppConstants.TOPIC, order);
		return "Msge Published to Kafka Topic";
	}
	
}
