/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.recursivite.suites.fibonacci;

import exercices.core.Application;
import exercices.recursivite.suites.interfaces.recursiviteInterface;

/**
 *
 * @author jeanchristian-petetin
 */
public class SuiteFibo extends Application implements recursiviteInterface{

    @Override
    public void start() {
        suite(1);
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int max = 23;
    public int prc = 0;
    @Override
    public int suite(int n) {
        max--;
        System.out.println("prc");
        
        if (max > 0){
            int temp = n + prc;
            prc = n;
                suite(temp);
        }
        return 0;
    }
    
}
