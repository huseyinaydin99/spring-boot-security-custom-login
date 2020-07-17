package com.huseyinaydin.springsecuritycustomlogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping(path = "/",method = RequestMethod.GET)
    @ResponseBody
    public String home(){
        return "<center><font face='consolas'> Merhaba Dünya </font></center>";
    }
}
