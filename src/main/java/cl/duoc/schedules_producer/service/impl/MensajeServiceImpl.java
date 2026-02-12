package cl.duoc.schedules_producer.service.impl;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import cl.duoc.schedules_producer.config.RabbitMQConfig;
import cl.duoc.schedules_producer.service.MensajeService;

@Service
public class MensajeServiceImpl implements MensajeService {

	private final RabbitTemplate rabbitTemplate;

	public MensajeServiceImpl(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	@Override
	public void enviarObjeto(Object objeto) {

		rabbitTemplate.convertAndSend(RabbitMQConfig.MAIN_QUEUE, objeto);
	}
}
