package com.skcet.day1.Controller.colorgame;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Color")
public class Favcolor {
@GetMapping("/color")
public String getMyfav()
{
	String color="Green";
	return "My favorite color is "+color;
}
}
