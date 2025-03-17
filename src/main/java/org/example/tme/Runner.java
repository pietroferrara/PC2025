package org.example.tme;

public class Runner {
    public static void main(String[] args) {
        Computer c = new Computer("comp");
        Telephone tel = new Telephone("tel");
        Smartphone sm = new Smartphone("sm");
        c.sendMessage(tel);
        sm.receiveMessage(tel);
        c.sendMessage("Message from computer");
        sm.receiveMessage("Message from computer");
        sm.sendMessage("Message from smartphone");
        tel.receiveMessage("Message from smartphone");
        tel.sendMessage("Message from telephone");
        c.receiveMessage("Message from telephone");
    }
}
