package com.galaxyweblink.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.galaxyweblink.microservices.limitsservice.bean.LimitConfiguraion;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration;
	@GetMapping("/limits")
	public LimitConfiguraion retrieveLimitsFromConfiguration(){
		return new LimitConfiguraion(configuration.getMaximum(), configuration.getMinimum());
		
	}
}
