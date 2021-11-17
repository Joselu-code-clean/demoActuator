package com.example.demoActuator.component;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "customEndpoint")
public class CustomEndpoint {

	@GetMapping("/custom")
	public ResponseEntity<String> customEndPoint(){
		return new ResponseEntity<>("Bienvenido a un metodo endpoint personalizado", HttpStatus.OK);
	}
	
}
