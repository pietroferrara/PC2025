package org.example.tme;

import java.util.ArrayList;
import java.util.List;

public class Smartphone extends Device implements ObjectMessanger, StringMessanger {
    List<Object> objectreceivedmessage = new ArrayList<>();
    List<Object> objectsentmessage = new ArrayList<>();
    List<String> stringreceivedmessage = new ArrayList<>();
    List<String> stringsentmessage = new ArrayList<>();

    public Smartphone(String id) {
        super(id);
    }

    @Override
    public List<Object> getObjectSentMessages() {
        return this.objectsentmessage;
    }

    @Override
    public List<Object> getObjectReceivedMessages() {
        return this.objectreceivedmessage;
    }

    @Override
    public List<String> getStringSentMessages() {
        return this.stringsentmessage;
    }

    @Override
    public List<String> getStringReceivedMessages() {
        return this.stringreceivedmessage;
    }
}
