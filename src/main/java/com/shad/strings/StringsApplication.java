package com.shad.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
	}
	
	// set up the root route
    @RequestMapping("/")
    public String root() { 
            return "Hello client! How are you doing?";
    }
    
    // set up the random route
    @RequestMapping("/random")
    public String random() { 
            return "Spring Boot is great! So easy to jsut respond with strings";
    }

}
