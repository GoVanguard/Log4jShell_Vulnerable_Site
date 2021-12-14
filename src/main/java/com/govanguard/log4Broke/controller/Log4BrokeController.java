package com.govanguard.log4broke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestHeader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class Log4BrokeController {
    private static final Logger logger = LogManager.getLogger(Log4BrokeController.class);

	@GetMapping("/")
    public String getForm(Model model) {
		return "inputForm";
	}

    @PostMapping("/saveDetails") 
    public String saveDetails(@RequestParam("testInput") String testInput, @RequestHeader("user-agent") String userAgent, ModelMap modelMap) {
        modelMap.put("testInput", testInput);
        logger.debug("Logged the following test input:");
        logger.debug(testInput);
        logger.debug("Logged the following user-agent:");
        logger.debug(userAgent);
        return "submittedView";
    }
}
