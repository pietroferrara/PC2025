package org.example;

import java.util.Date;

public class Personne {
    private String nom, prenom;
    private Date naissance;

    public Personne(String nom, String prenom, Date naissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public void setMemeNaissance(Personne p) {
        this.naissance = p.getNaissance();
    }
    public void setMemeNaissance(Etudiant p) {
        this.naissance = null;
    }

    public boolean isBetterThan(Personne p, Personne p1) {
        return p.naissance.before(p1.getNaissance());
    }

    /*public boolean isBetterThan(Etudiant p, Etudiant p1) {
        return p.getExams() >= p1.getExams();
    }*/

    public boolean isBetterThan(Etudiant p, Personne p1) {
        return true;
    }

    public boolean isBetterThan(Personne p, Etudiant p1) {
        return false;
    }
}
