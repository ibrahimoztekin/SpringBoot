package com.works.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

  @GetMapping("/")
  public String login(){
    return "login";
  }

}
