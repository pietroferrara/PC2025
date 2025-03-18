package org.example.td;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Device {

    @Id
    private final String id;

    public String getId() {
        return id;
    }

    public Device(String id) {
        this.id = id;
    }

    public Device() {
        this("temporary");
    }
}
