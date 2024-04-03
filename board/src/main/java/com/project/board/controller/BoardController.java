package com.project.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	@GetMapping("/get")
	public String get(){
		return "<h1>get 요청됨</h1>";
	}
}
