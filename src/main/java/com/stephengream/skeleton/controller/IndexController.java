package com.stephengream.skeleton.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by stephen on 29/11/16.
 */
@Controller
@RequestMapping({"/index","/"})
public class IndexController {
    @GetMapping
    public String getIndex(){
        return "index/index";
    }
}
