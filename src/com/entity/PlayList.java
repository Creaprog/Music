package com.entity;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<Morceau> maListe;

    public PlayList() {
        maListe = new ArrayList<Morceau>();
    }

    public List<Morceau> getMaListe() {
        return maListe;
    }

    public void setMaListe(List<Morceau> maListe) {
        this.maListe = maListe;
    }

    public void ajouterMorceau(Morceau morceau) {
        this.maListe.add(morceau);
    }

    public void afficheToi() {
        for (Morceau morceau : this.maListe) {
            System.out.println("titre du morceau est " + morceau.getTitre());
        }
    }
}
