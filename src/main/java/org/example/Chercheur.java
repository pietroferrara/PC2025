package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface Chercheur {

    default public void publishPaper(int i) {
        this.getPapierscientifique().add(i);
    }

    default public int getPapers() {
        return this.getPapierscientifique().size();
    }

    public List<Integer> getPapierscientifique();
}
