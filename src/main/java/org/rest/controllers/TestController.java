package org.rest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by oussama on 4/6/2015.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/test")
    String hello() {
        return "hello";
    }
}
