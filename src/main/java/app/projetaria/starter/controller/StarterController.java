package app.projetaria.starter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/start")
public class StarterController {

	@GetMapping
	public ResponseEntity<String> alive() {
		return ResponseEntity.ok().body("Im Alive !");
	}
}
