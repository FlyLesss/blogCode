package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//RestController：默认类中的方法都会以json的格式返回。
@RestController

public class DemoController {
	
	@RequestMapping("/hello")
	String index(){
        return "Hello Spring Boot!";
	}
}
