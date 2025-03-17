package org.example.tme;

import java.util.List;

public interface ObjectMessanger {

    List<Object> getObjectSentMessages();
    List<Object> getObjectReceivedMessages();

    default public void sendMessage(Object message) {
        this.getObjectSentMessages().add(message);
    }

    default public void receiveMessage(Object message) {
        this.getObjectReceivedMessages().add(message);
    }
}
