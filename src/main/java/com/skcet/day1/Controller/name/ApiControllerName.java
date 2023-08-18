package com.skcet.day1.Controller.name;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiControllerName {
@GetMapping("/ApiControllerName")
public String getName()
{
	String stuName="IamNK";
	return "Welcome "+stuName+"!";
}
}
