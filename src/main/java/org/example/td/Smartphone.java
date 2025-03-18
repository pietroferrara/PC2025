package org.example.td;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Smartphone extends Computer implements StringMessanger {
    @ElementCollection
    private List<String> sentMessages = new ArrayList<>();

    @ElementCollection
    private List<String> receivedMessages = new ArrayList<>();

    public Smartphone(String id) {
        super(id);
    }

    @Override
    public void sendMessage(String message) {
        sentMessages.add(message);
    }

    @Override
    public void receiveMessage(String message) {
        receivedMessages.add(message);
    }


    public Smartphone() {
        this("temporary");
    }
}
