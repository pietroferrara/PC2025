package org.example;

import java.util.List;

public interface ScientificCreator {
    default public void publishPaper(int i) {
        this.getPapierscientifique().add(i);
    }
    public List<Integer> getPapierscientifique();
}
