/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somme;

import racine.*;
import equationdeg2.*;

/**
 *
 * @author ESDRAS
 */
public class Params {
    public double x,y;

    public Params() {
    }

    
    public Params(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public String toString(){
        return "x: "+x+ " y: "+y;
    }
}
