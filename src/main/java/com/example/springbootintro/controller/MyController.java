package com.example.springbootintro.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

  @GetMapping("/")
  public ResponseEntity<String> index() {
    return new ResponseEntity<>("Greetings to index page", HttpStatus.OK);
  }

  @GetMapping("/helloo")
  public ResponseEntity<String> hello() {
    return new ResponseEntity<>("Hello World", HttpStatus.OK);
  }

  @GetMapping("/hello/{id}")
  public ResponseEntity<String> helloByPath(@PathVariable String id) {
    return new ResponseEntity<>("Hello " + id, HttpStatus.OK);
  }

  @GetMapping("/hello")
  public ResponseEntity<String> helloByQueryParam(@RequestParam String id) {
    return new ResponseEntity<>("Hello " + id, HttpStatus.OK);
  }

  @GetMapping("/hello2/{id}")
  public ResponseEntity<String> helloByPath2(@PathVariable int id, @RequestParam(required=false) String caps) {
    String message= generateMessage(id, caps);
    return new ResponseEntity<>(message, HttpStatus.OK);
  }

  @GetMapping("/hello2")
  public ResponseEntity<String> helloByQueryParam2(@RequestParam int id, @RequestParam(required = false) String caps) {
    String message= generateMessage(id, caps);
    return new ResponseEntity<>(message, HttpStatus.OK);
  }

  public String generateMessage(int id, String caps) {
    String message="";
    if (id==1){
      message="Velkommen til KEA 1. semester";
    }
    else {
      message="Velkommen til KEA 2. semester";
    }
    if (caps != null && caps.equals("j")) {
      message = message.toUpperCase();
    }
    return message;
  }
}
