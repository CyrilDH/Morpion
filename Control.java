package com.example.myapplication;

import android.content.Context;

import org.json.JSONArray;

import java.util.Date;

public final class Control {

    private static Control instance = null;
    private static Profil profil;
    private static String nomfFic = "saveprofil";
    //private static AccesLocal accesLocal;
private static AccesDistant accesDistant;

    private Control() {super();}


    public static final Control getInstance(){
        if(Control.instance == null){
            Control.instance = new Control();
        //    accessLocal = new AccesLocal(contexte);

            accesDistant = new AccesDistant();
            accesDistant.envoi("dernier", new JSONArray());
          //  profil = accesLocal.recupDernier();

        }
        return Control.instance;
    }

    public void creerProfil (Integer nom, Integer Etat, Context contexte){

        profil = new Profil(new Date(), nom, Etat);
        accesDistant.envoi("enreg", profil.convertToJSONArray());
    }






}
