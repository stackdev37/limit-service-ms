package com.stackdev37.limitservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LImitsConfigurationController {
    @GetMapping("/limits")
    public LImitConfiguration retriveLimitsFromConfigurations() {
        return new LImitConfiguration(1000, 1);
    }
}
