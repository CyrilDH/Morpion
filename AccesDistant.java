package com.example.myapplication;

import android.util.Log;

import org.json.JSONArray;

public class AccesDistant implements  AsyncResponse {

    private static final String SERVERADOR = "http://192.168.56.1/morpion/serveurcoach.php";

    public AccesDistant(){
       super();
   }

    @Override
    public void processFinish(String output) {

       Log.d("serveur", "****************"+output);
       String[] message = output.split("%");

       if(message.length>1){

           if(message[0].equals("enreg")) {
               Log.d("enreg", "************"+message[1]);


           }else{
               if(message[0].equals("dernier")) {
                   Log.d("dernier", "************"+message[1]);

               }else{

               if(message[0].equals("Erreur !")){
                           Log.d("Erreur", "************"+message[1]);
               }
           }

       }

    }

}
    public void envoi(String operation, JSONArray lesDonneesJSON){
        AccesHTTP accesDonnees = new AccesHTTP();

        accesDonnees.delegate = this;

        accesDonnees.addParam("operation", operation);
        accesDonnees.addParam("lesdonnees", lesDonneesJSON.toString());

        accesDonnees.execute(SERVERADOR);

    }
}