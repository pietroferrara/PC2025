package org.example.tme;

import java.util.ArrayList;
import java.util.List;

public class Telephone extends Device implements StringMessanger {
    List<String> receivedmessage = new ArrayList<>();
    List<String> sentmessage = new ArrayList<>();


    public Telephone(String id) {
        super(id);
    }


    @Override
    public List<String> getStringSentMessages() {
        return this.sentmessage;
    }

    @Override
    public List<String> getStringReceivedMessages() {
        return this.receivedmessage;
    }
}
