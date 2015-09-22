package com.indasil.learnjava.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by vashishta on 9/22/15.
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping(method = RequestMethod.GET)
    public String person() {
        return "person";
    }
}
