package com.example.springbootintro.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

  @GetMapping("welcome")
  public ResponseEntity<String> sayWelcome() {
    return new ResponseEntity<>("Welcome to KEA", HttpStatus.OK);
  }

  @GetMapping("welcome2")
  @ResponseBody
  public String sayWelcome2() {
    return "welcome to KEA";
  }


}
