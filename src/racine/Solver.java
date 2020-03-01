/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racine;

/**
 *
 * @author ESDRAS
 */
public class Solver implements SolverInterface{

    @Override
    public Double resolve(double x) {
        if (x >= 0)
            return Math.sqrt(x);
        return null;
    }
    
}
