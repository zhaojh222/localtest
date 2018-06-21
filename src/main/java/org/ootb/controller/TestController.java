package org.ootb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiazhao on 2/5/18.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello")
    public String hello(){
        LOGGER.info("Running the hello service");
        return "hello";
    }
}
