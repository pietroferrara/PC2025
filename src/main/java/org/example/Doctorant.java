package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Doctorant extends Etudiant implements Chercheur {
    public Doctorant(String nom, String prenom, Date naissance, String id) {
        super(nom, prenom, naissance, id);
    }
    private List<Integer> papierscientific = new ArrayList();
    @Override
    public List<Integer> getPapierscientifique() {
        return papierscientific;
    }
}
