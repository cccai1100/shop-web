package com.ahpu.shop.web.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ccc on 16/8/16.
 */
@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
