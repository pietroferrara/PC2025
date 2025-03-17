package org.example.tme;

import java.util.ArrayList;
import java.util.List;

public class Computer extends Device implements ObjectMessanger {
    List<Object> receivedmessage = new ArrayList<>();
    List<Object> sentmessage = new ArrayList<>();


    public Computer(String id) {
        super(id);
    }


    public int add(int a, int b) {
        return a+b;
    }


    @Override
    public List<Object> getObjectSentMessages() {
        return this.sentmessage;
    }

    @Override
    public List<Object> getObjectReceivedMessages() {
        return this.receivedmessage;
    }
}
