package cl.duoc.schedules_producer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.schedules_producer.dto.RouteUpdateDTO;
import cl.duoc.schedules_producer.service.MensajeService;

@RestController
@RequestMapping("/api/producer/schedules")
public class MensajeController {

	private final MensajeService mensajeService;

	public MensajeController(MensajeService mensajeService) {

		this.mensajeService = mensajeService;
	}

	@PostMapping("/update")
	public ResponseEntity<String> updateSchedule(@RequestBody RouteUpdateDTO routeUpdateDTO) {

		mensajeService.enviarObjeto(routeUpdateDTO);
		return ResponseEntity.ok("Objeto enviado: " + routeUpdateDTO.toString());
	}
}
