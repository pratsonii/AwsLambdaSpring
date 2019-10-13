package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc //this annotation is mandatory
//Here request mapping wont work
public class AppController {

	@GetMapping("/forte")
	public String getMethod1()
	{
		return "Hello Lambda!";
	}
	
	@GetMapping("/test")
	public String getMethod2()
	{
		return "This is test url";
	}
}
