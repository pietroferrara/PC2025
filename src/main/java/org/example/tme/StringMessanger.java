package org.example.tme;

import java.util.List;

public interface StringMessanger {

    List<String> getStringSentMessages();
    List<String> getStringReceivedMessages();

    default public void sendMessage(String message) {
        this.getStringSentMessages().add(message);
    }

    default public void receiveMessage(String message) {
        this.getStringReceivedMessages().add(message);
    }
}
