package org.example;

import java.sql.Date;

public class Main {

    protected int a;

    public void foo() {
        int i = 10;
    }

    public void foo2(Personne p) {
        Main.printName(null);
        this.foo();
        p.getNom();
    }

    public static void printName(Personne p) {
        System.out.println(p.getNom() + " " + p.getPrenom());
    }

    public static void main(String[] args) {

        Etudiant a = new Etudiant("Antoine", "Mine", null, "1");
        Etudiant a2 = new Etudiant("Antoine2", "Mine2", null, "1");
        a.passExam(123);
        Personne p1 = a;
        Personne p = new Personne("Pietro", "Ferrara", null);

        Professeur prof = new Professeur("Pietro", "Ferrara", null);
        prof.publishPaper(1);
        Doctorant d = new Doctorant("A", "b", null, "123");
        System.out.println(d.getPapers());

    }
}