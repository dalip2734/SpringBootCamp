package com.dalipkumar.booting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
public class BootingApp {
	public static void main(String[] args) {
		SpringApplication.run(BootingApp.class, args);
	}

	@Controller
	class HelloController{
		@GetMapping("/hello")
		public String hello(){
            return "redirect:/index.html";
		}
	}
}
