/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage;

import exercices.core.Application;
import exercices.heritage.animaux.entities.Animal;
import exercices.heritage.animaux.entities.Tripoteur;
import exercices.heritage.animaux.entities.impl.Chat;
import exercices.heritage.animaux.entities.impl.Chien;

/**
 *
 * @author JesuScript
 */
public class Heritage extends Application {

    @Override
    public void start() {
       Animal chien = new Chien();
       Animal chat = new Chat();
       Tripoteur Francois = new Tripoteur();
       
       chien.emettreSon();
       
       
       Francois.tripote(chat);
       chat.emettreSon();
       
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
