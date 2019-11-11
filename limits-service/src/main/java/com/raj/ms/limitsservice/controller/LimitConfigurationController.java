package com.raj.ms.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raj.ms.limitsservice.Configuration;
import com.raj.ms.limitsservice.bean.LimitsServiceConfiguration;

@RestController
public class LimitConfigurationController {

	@Autowired
	private Configuration configuration;
	
	@RequestMapping(method=RequestMethod.GET, value = "/limits")
	public LimitsServiceConfiguration getConfiguration()
	{
		return new LimitsServiceConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
