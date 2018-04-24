package com.satya.demo;

import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WhatEverIWant {

	@GetMapping("/hi/{name}")
	public String hiThere(Map model, @PathVariable String name){
		model.put("name", name);
		return "hello";
	}
}
