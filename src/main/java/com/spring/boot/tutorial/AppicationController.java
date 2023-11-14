package com.spring.boot.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppicationController {
	@RequestMapping(value="/index")
	@ResponseBody
	public String getIndex() {
		return "index";
		
	}
}
