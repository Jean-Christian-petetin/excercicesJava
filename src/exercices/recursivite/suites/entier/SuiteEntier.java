/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.recursivite.suites.entier;

import exercices.core.Application;
import exercices.recursivite.suites.interfaces.recursiviteInterface;

/**
 *
 * @author jeanchristian-petetin
 */
public class SuiteEntier extends Application implements recursiviteInterface{

    @Override
    public void start() {
        suite(0);
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int max = 300;
    
    @Override
    public int suite(int n) {
        max--;
        System.out.println(n);
        if (max > 0){
            suite(n+1);
        }
    return 0;
    }
    
}
