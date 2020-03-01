/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racine;

import equationdeg2.*;

/**
 *
 * @author ESDRAS
 */
public class Params {
    public double x;

    public Params(double x) {
        this.x = x;
    }
    
    @Override
    public String toString(){
        return "x: "+x;
    }
}
