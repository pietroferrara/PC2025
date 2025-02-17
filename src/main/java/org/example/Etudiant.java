package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Etudiant extends Personne {

    private List<Integer> exams = new ArrayList<>();

    private String id;


    public Etudiant(String nom, String prenom, Date naissance, String id) {
        super(nom, prenom, naissance);
        this.id = id;
    }

    public int getExams() { return exams.size(); }

    public void passExam(int i) {
        exams.add(i);
    }

    @Override
    public String getNom() {
        return this.id+" "+super.getNom();
    }
}
