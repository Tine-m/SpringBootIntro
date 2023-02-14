package com.example.springbootintro.repositories;

import com.example.springbootintro.model.Message;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class WelcomeMessageRepo {

  private final String message1 = "Velkommen til KEA 1.semester";
  private final String message2 = "Velkommen til KEA 2.semester";
  private ArrayList<Message> messages =
      new ArrayList<>(List.of(new Message(10, "ABC"), new Message(20, "CBA")));

  public Message getWelcomeMessage(int id) {
    if (id == 1) {
      return new Message(id, message1);
    } else return new Message(id, message2);
  }

  public List<Message> getWelcomeMessages() {
    ArrayList<com.example.springbootintro.model.Message> messages = new ArrayList<>();
    messages.add(new Message(1, message1));
    messages.add(new Message(2, message2));
    return messages;
  }

  public void createMessage(Message message) {
    messages.add(message);
  }
}
