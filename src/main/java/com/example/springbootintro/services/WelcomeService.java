package com.example.springbootintro.services;

import com.example.springbootintro.model.Message;
import com.example.springbootintro.repositories.WelcomeMessageRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WelcomeService {

  private WelcomeMessageRepo welcomeMessageRepo;

  public WelcomeService() {
    this.welcomeMessageRepo = new WelcomeMessageRepo();
  }

  public Message getWelcomeMessage(int id) {
    return welcomeMessageRepo.getWelcomeMessage(id);
  }

  public List<Message> getWelcomeMessages() {
    return welcomeMessageRepo.getWelcomeMessages();
  }

  public void createMessage(Message message) {
    welcomeMessageRepo.createMessage(message);
  }
}
