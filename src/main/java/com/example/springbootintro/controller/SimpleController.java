package com.example.springbootintro.controller;

import com.example.springbootintro.model.Message;
import com.example.springbootintro.services.WelcomeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("kea")
public class SimpleController {

  private WelcomeService welcomeService = new WelcomeService();

  public SimpleController(WelcomeService welcomeService) {
    this.welcomeService = welcomeService;
  }

  @GetMapping(path="welcome")
  public ResponseEntity<List<Message>> velkommenAlle() {
    List<Message> messages = welcomeService.getWelcomeMessages();
    return new ResponseEntity<>(messages,HttpStatus.OK);
  }

  @GetMapping(path="welcome/{id}")
  public ResponseEntity<Message> velkommen(@PathVariable int id) {
    Message message = welcomeService.getWelcomeMessage(id);
    return new ResponseEntity<>(message, HttpStatus.OK);
  }

  @PostMapping("welcome/create")
  public ResponseEntity<Message> postMessage(@RequestBody Message message) {
    welcomeService.createMessage(message);
    return new ResponseEntity<>(message, HttpStatus.OK);
  }

  @GetMapping(path="welcome1/{id}")
  public ResponseEntity<Message> velkommen1(@PathVariable int id) {
    Message msg = new Message(id, "hej");
    return new ResponseEntity<>(msg, HttpStatus.OK);
  }

}
