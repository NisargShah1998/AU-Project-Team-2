package com.au.discussionforum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnswerController {
	@GetMapping("/")
	public String Hello() {
		return "hello";
	}
}
