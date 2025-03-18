package org.example.td;

import java.util.ArrayList;

public class Telephone extends Device implements  StringMessanger {
    public Telephone(String id) {
        super(id);
    }

    private ArrayList<String> sentMessages = new ArrayList<>();
    private ArrayList<String> receivedMessages = new ArrayList<>();

    @Override
    public void sendMessage(String message) {
        sentMessages.add(message);
    }

    @Override
    public void receiveMessage(String message) {
        receivedMessages.add(message);
    }
}
