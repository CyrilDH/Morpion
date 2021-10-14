package com.example.myapplication;

import org.json.JSONArray;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Profil implements Serializable {


    private Date date;
    private Integer nom;
    private Integer Etat;

    public Profil(Date date, Integer nom, Integer Etat  ){

        this.date = date;
        this.nom = nom;
        this.Etat = Etat;

    }

    public JSONArray convertToJSONArray(){

List laListe = new ArrayList();

laListe.add(date);
laListe.add(nom);
laListe.add(Etat);

return new JSONArray(laListe);
    }

}


