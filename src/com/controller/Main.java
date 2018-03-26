package com.controller;

import com.entity.Morceau;
import com.entity.PlayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("toto");
        Morceau morceau = new Morceau();
        morceau.setTitre("toto");
        PlayList playList = new PlayList();
        playList.ajouterMorceau(morceau);
        playList.afficheToi();
        System.out.println(System.getProperty("user.dir")+ "/MaMusic");
    }
}