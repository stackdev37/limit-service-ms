package com.stackdev37.limitservice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LImitsConfigurationController {

    @Autowired
    private Configuration configuration;
    @GetMapping("/limits")
    public LImitConfiguration retriveLimitsFromConfigurations() {
        return new LImitConfiguration(configuration.getMaximum(), configuration.getMinimum());
    }
}
