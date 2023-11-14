package com.spring.boot.tutorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppicationRestController {

	@GetMapping								//@RequestMapping can be used too. 
	public String getIndex() {
		return getClass().getSimpleName();		
	}
}
