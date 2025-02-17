package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professeur extends Personne implements Chercheur, ScientificCreator {
    public Professeur(String nom, String prenom, Date naissance) {
        super(nom, prenom, naissance);
    }

    private List<Integer> papierscientific = new ArrayList();
    @Override
    public List<Integer> getPapierscientifique() {
        return papierscientific;
    }
}
