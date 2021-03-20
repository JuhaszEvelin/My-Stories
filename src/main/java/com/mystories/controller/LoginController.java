/*
package com.mystories.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    */
/*XRepository x;
    public GreetingController(XRepository x) {
        this.x = x;
    }
    *//*

    @GetMapping("/login")
    public String login(@RequestParam(name = "name", name = "password", required = true,) String name, String password, Model model) {
        model.addAttribute("name", name, "password", password);
        //  model.addAttribute("xattr", x.findById(.x)

        return "login";
    }

}
*/
