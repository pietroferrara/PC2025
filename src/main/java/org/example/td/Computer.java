package org.example.td;

import java.util.ArrayList;

public class Computer extends Device implements ObjectMessanger {
    public Computer(String id) {
        super(id);
    }

    public int add(int a, int b) {
        return a + b;
    }

    private ArrayList<Object> sentMessages = new ArrayList<>();
    private ArrayList<Object> receivedMessages = new ArrayList<>();

    @Override
    public void sendMessage(Object message) {
        sentMessages.add(message);
    }

    @Override
    public void receiveMessage(Object message) {
        receivedMessages.add(message);
    }
}
