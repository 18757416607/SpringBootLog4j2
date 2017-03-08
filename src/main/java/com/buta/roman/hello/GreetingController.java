package com.buta.roman.hello;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        Greeting gr = new Greeting(counter.incrementAndGet(),
                String.format(template, name));

        LOGGER.info(gr.toString());
        LOGGER.warn(gr.toString());
        LOGGER.error(gr.toString());
        LOGGER.debug(gr.toString());
        LOGGER.info(gr.toString());
        LOGGER.warn(gr.toString());
        LOGGER.error(gr.toString());
        LOGGER.debug(gr.toString());
        LOGGER.info(gr.toString());
        LOGGER.warn(gr.toString());
        LOGGER.error(gr.toString());
        LOGGER.debug(gr.toString());
        LOGGER.info(gr.toString());
        LOGGER.warn(gr.toString());
        LOGGER.error(gr.toString());
        LOGGER.debug(gr.toString());
        return gr;
    }
}
