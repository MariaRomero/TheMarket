package com.example.demo.controllers;

import com.example.demo.Market;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MarketController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/market")
    public Market market(@RequestParam(value="name", defaultValue="World") String name) {
        return new Market(counter.incrementAndGet(),
                String.format(template, name));
    }

}


