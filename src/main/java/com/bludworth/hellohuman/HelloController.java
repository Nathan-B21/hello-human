package com.bludworth.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String name, @RequestParam(value="q2", required=false) String lastName){
		if(name == null) {
			return "Hello Human";
		}
		else if(lastName == null) {
			return "Hello " + " " + name;
		}
		else {
			return "Hello" + " " + name + " " + lastName;
		}
	}
	


}
