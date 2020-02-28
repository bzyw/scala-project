package org.bzyw.train.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello,World!";
    }
}
