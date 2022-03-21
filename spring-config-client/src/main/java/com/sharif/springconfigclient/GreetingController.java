package com.sharif.springconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class GreetingController {

    @Value("${msg}")
    private String greetingMessage;
    public GreetingController()
    {


    }


    @GetMapping("/greeting")
    public String greeting()
    {
        return "Hello Greetings" + getGreetingMessage();
    }

    public String getGreetingMessage() {
        return greetingMessage;
    }
}
