package com.works.mvc.controllers;



import lombok.RequiredArgsConstructor;

import javax.validation.Valid;

import java.util.List;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.works.mvc.entities.login;
import com.works.mvc.services.LoginService;

@Controller
@RequiredArgsConstructor
public class RegisterController {

  final LoginService loginService;

  @GetMapping("/register")
  public String register(Model model){
    model.addAttribute("login",new login());
    return "register";
  }

  @PostMapping("/adminRegister")
  public String adminRegister(@Valid login login, BindingResult binding , Model model){
    if(binding.hasErrors()){
      model.addAttribute("errors",binding.getFieldErrors());
     //List<FieldError> fieldErrors= binding.getFieldErrors();
     //for (FieldError error: fieldErrors){
     //  System.out.println(error.getField() + " "+ error.getDefaultMessage());
    // }
      return "register";
    }
    boolean status = loginService.register(login);
    if(status){
      //System.out.println(login);
      return "redirect:/";
    }
    return "register";
  }

}
