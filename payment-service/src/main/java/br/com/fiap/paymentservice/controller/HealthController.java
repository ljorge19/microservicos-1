package br.com.fiap.paymentservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.paymentservice.dto.Health;



@RestController
@RequestMapping("/health")
public class HealthController {
	
	@GetMapping
	public ResponseEntity<Health> getHealth() {
		return new ResponseEntity<Health>(new Health("Ok"), HttpStatus.OK);
	}
}
