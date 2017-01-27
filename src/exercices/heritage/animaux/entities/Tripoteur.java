/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage.animaux.entities;

/**
 *
 * @author jonathan-gomez
 */
public class Tripoteur {
    
    public String prenom = "";
    
    public void tripote(Animal objet) {
        this.prenom = "François";
        
        System.out.println(
                prenom + " "
                + this.getClass().getDeclaredMethods()[0].getName() + " "
                + objet.getClass().getSimpleName());
        objet.emettreSon();
        System.out.println(prenom + " Force "
                + objet.getClass().getSimpleName());
        objet.son = "adore ça";
       
    }
}
