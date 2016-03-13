package com.ctretyak.spring.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ctretyak on 13.03.2016.
 */
@Controller
public class HelloController {

	public static final Logger logger = Logger.getLogger(HelloController.class);

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		logger.info("Hello view");
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}

}
