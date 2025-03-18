package org.example;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Professeur extends Personne implements /*Chercheur,*/ ScientificCreator {
    public Professeur(String nom, String prenom, Date naissance) {
        super(nom, prenom, naissance);
    }

    private List<Integer> papierscientific = new ArrayList();

    @Override
    public void publishPaper(int i) {
        Chercheur.super.publishPaper(i);
    }

    @Override
    public int getPapers() {
        return Chercheur.super.getPapers();
    }

    @Override
    public List<Integer> getPapierscientifique() {
        return papierscientific;
    }
}
