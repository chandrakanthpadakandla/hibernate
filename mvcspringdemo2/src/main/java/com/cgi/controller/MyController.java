4package com.cgi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/show")
	public String message(Model model) {
		model.addAttribute("message","this is chandu");
		return "disp";
	}

}
